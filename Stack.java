public class Stack {


    private static Elem first_elem;
    private static Elem last_elem;

    static boolean is_created = false;

    static int count_of_elems;
    static int max_of_elems = 10;


    class Elem {

        private int data;
        private Elem next;

        public Elem (int data) {

            if (!is_created) {

                this.data = data;
                next = null;
                first_elem = this;
                last_elem = this;
            } else {

                this.data = data;
                last_elem.next = this;
                next = null;
            }
        }
    }


    public void delete_elem (int idnx) {

        int count = 0;
        Elem go = first_elem;

        while (count != (idnx - 1)) {

            go = go.next;
            count++;
        }

        go.next = go.next.next;
        count_of_elems--;
    }

    public void add_elem (int data) {

        new Elem (data);
        count_of_elems++;
    }

    public Elem get_first_elem () {

        return first_elem;
    }

    public Elem get_last_elem () {

        return last_elem;
    }

    public boolean is_free () {

        if (first_elem == null) return true;
        else return false;
    }

    public boolean is_full () {

        if (count_of_elems == max_of_elems) return true;
        else return false;
    }

    public void show_a_show () {

        Elem for_show = first_elem;

        while (for_show != last_elem) {

            System.out.println(for_show.data);
            for_show = for_show.next;
        }

        System.out.println(for_show.data);
    }
}
