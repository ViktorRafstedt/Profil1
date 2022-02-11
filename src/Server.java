import java.io.*;

public class Server {

    String oldEmail, oldName, oldLastname,oldPassword,oldMerit;

    public Server(){

    }


    public String readServer() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader("database.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "error";

    }


    public void updateEmail(String newEmail) throws IOException {
        String starPrefix = "email:";

        RandomAccessFile file = new RandomAccessFile(new File("database.txt"), "rw");

        String line;
        while((line = file.readLine()) != null)
        {
            if(line.startsWith(starPrefix))
            {
                file.seek(file.getFilePointer()-readEmail().length());
                file.writeBytes(" "+newEmail+"                    ");
            }

        }


    }

    public String readEmail() throws IOException {
        String startPrefix = "email:";

        RandomAccessFile file = new RandomAccessFile(new File("database.txt"), "rw");

        String line;
        while((line = file.readLine()) != null)
        {
            if(line.startsWith(startPrefix))
            {
                //System.out.println("Here");
                //file.seek(file.getFilePointer());
                oldEmail = line.substring(startPrefix.length());
            }

        }
        return oldEmail;

    }

    public void updateName(String newName) throws IOException {
        String starPrefix = "name:";

        RandomAccessFile file = new RandomAccessFile(new File("database.txt"), "rw");

        String line;
        while((line = file.readLine()) != null)
        {
            if(line.startsWith(starPrefix))
            {
                file.seek(file.getFilePointer()-readEmail().length());
                file.writeBytes(" "+newName+"                    ");
            }

        }


    }

    public void updatePassw(String newPassw) throws IOException {
        String starPrefix = "password:";

        RandomAccessFile file = new RandomAccessFile(new File("database.txt"), "rw");

        String line;
        while((line = file.readLine()) != null)
        {
            if(line.startsWith(starPrefix))
            {
                file.seek(file.getFilePointer()-readPassw().length());
                file.writeBytes(" "+newPassw+"                    ");
            }

        }


    }

    public String readName() throws IOException {
        String startPrefix = "name:";

        RandomAccessFile file = new RandomAccessFile(new File("database.txt"), "rw");

        String line;
        while((line = file.readLine()) != null)
        {
            if(line.startsWith(startPrefix))
            {
                //System.out.println("Here");
                //file.seek(file.getFilePointer());
                oldName = line.substring(startPrefix.length());
            }

        }
        return oldName;

    }

    public String readLastname() throws IOException {
        String startPrefix = "lastname:";

        RandomAccessFile file = new RandomAccessFile(new File("database.txt"), "rw");

        String line;
        while((line = file.readLine()) != null)
        {
            if(line.startsWith(startPrefix))
            {
                //System.out.println("Here");
                //file.seek(file.getFilePointer());
                oldLastname = line.substring(startPrefix.length());
            }

        }
        return oldLastname;

    }


    public String readPassw() throws IOException {
        String startPrefix = "password:";

        RandomAccessFile file = new RandomAccessFile(new File("database.txt"), "rw");

        String line;
        while((line = file.readLine()) != null)
        {
            if(line.startsWith(startPrefix))
            {
                //System.out.println("Here");
                //file.seek(file.getFilePointer());
                oldPassword = line.substring(startPrefix.length());
            }

        }
        return oldPassword;

    }

    public String readMerit() throws IOException {
        String startPrefix = "GPA:";

        RandomAccessFile file = new RandomAccessFile(new File("database.txt"), "rw");

        String line;
        while((line = file.readLine()) != null)
        {
            if(line.startsWith(startPrefix))
            {
                //System.out.println("Here");
                //file.seek(file.getFilePointer());
                oldMerit = line.substring(startPrefix.length());
            }

        }
        return oldMerit;

    }
}
