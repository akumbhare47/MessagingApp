package messagingApp.inboxApp;

import java.nio.file.Path;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import messagingApp.inboxApp.folders.Folder;
import messagingApp.inboxApp.folders.FolderRepository;

@SpringBootApplication
@RestController
public class MessagingApp {

	@Autowired FolderRepository folderRepository;

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
		folderRepository.save(new Folder("pawansp", "junk", "yeloow"));
	}


}
