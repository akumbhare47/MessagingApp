package messagingApp.inboxApp;

import java.nio.file.Path;
import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import com.datastax.oss.driver.api.core.uuid.Uuids;

import messagingApp.inboxApp.emaillist.EmailListItem;
import messagingApp.inboxApp.emaillist.EmailListItemKey;
import messagingApp.inboxApp.emaillist.EmailListItemRepository;
import messagingApp.inboxApp.folders.Folder;
import messagingApp.inboxApp.folders.FolderRepository;

@SpringBootApplication
@RestController
public class MessagingApp {

	@Autowired FolderRepository folderRepository;
	@Autowired EmailListItemRepository emailListItemRepository;

	public static void main(String[] args) {
		SpringApplication.run(MessagingApp.class, args);
	}

	@Bean
	public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties astraProperties) {
		Path bundle = astraProperties.getSecureConnectBundle().toPath();
		return builder -> builder.withCloudSecureConnectBundle(bundle);
	}
	
	@PostConstruct
	public void init(){
		folderRepository.save(new Folder("akumbhare47", "inbox", "blue"));
		folderRepository.save(new Folder("akumbhare47", "Sent", "green"));
		folderRepository.save(new Folder("akumbhare47", "important", "red"));

		for(int i = 0; i < 10; i++){
			EmailListItemKey key = new EmailListItemKey();
			key.setId("akumbhare47");
			key.setLabel("Inbox");
			key.setTimeUUID(Uuids.timeBased());

			EmailListItem item = new EmailListItem();
			item.setKey(key);
			item.setTo(Arrays.asList("akumbhare47"));
			item.setSubject("subject" + i);
			item.setUnread(true);

			emailListItemRepository.save(item);
		}
	}


}
