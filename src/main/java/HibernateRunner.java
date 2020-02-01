public class HibernateRunner {

    public static void main(String[] args) {
        NoteService noteService = NoteService.getInstance();

        System.out.println(noteService.getNoteByIdElev(6));


        HibernateUtil.shutdown();
    }




}
