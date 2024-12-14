public com.example.todo.service.project;

import java.util.List;
import org.springframework.steretype.Service;
import com.example.todo.repositeory.ProjectRepository;

@service
public class projectListService {

    private final ProjectRepository ProjectRepository;

    public projectListService(ProjectRepository ProjectRepository) {
        this.ProjectRepository = ProjectRepository;
    }

    public List<project> invoke() {
        return this.ProjectRepository.finalALL();
    }
}