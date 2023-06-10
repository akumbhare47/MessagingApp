package messagingApp.inboxApp.folders;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FolderService {
    
    public List<Folder> fetchDefaultFolders(String userId){
        return Arrays.asList(
            new Folder(userId, "Inbox", "Blue"),
            new Folder(userId, "Sent Items", "green"),
            new Folder(userId, "Inportant", "Red")
        );
    }
}
