import java.nio.file.*;

public class FileLoader {

    private String pather = "C:\\disk_D\\ProjectsForIdea\\LiteForPatterns\\directoryDoc.txt";
    // 3 строки, 1-указ на файл с книг 2-указ на журн 3-указ публ.

    FileLoader(){
        Path testF = Paths.get(pather);
        Path normPath = testF.normalize();
        this.pather = String.valueOf(normPath);
    }
    String getPath(){
        return pather;
    }
}
