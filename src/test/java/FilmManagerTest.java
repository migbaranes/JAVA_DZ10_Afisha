import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FilmManagerTest {

    @Test
    public void testFindAll() {
        FilmManager user = new FilmManager();
        String movie1 = "Дефицит фантазии 1";
        String movie2 = "Дефицит фантазии 2";
        String movie3 = "Дефицит фантазии 3";

        user.add(movie1);
        user.add(movie2);
        user.add(movie3);


        String[] actual = user.findAll();
        String[] expected = {"Дефицит фантазии 1", "Дефицит фантазии 2", "Дефицит фантазии 3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimitLessSizeArray1() {
        FilmManager user = new FilmManager();
        String movie1 = "Дефицит фантазии 1";
        String movie2 = "Дефицит фантазии 2";
        String movie3 = "Дефицит фантазии 3";
        String movie4 = "Дефицит фантазии 4";
        String movie5 = "Дефицит фантазии 5";
        String movie6 = "Дефицит фантазии 6";

        user.add(movie1);
        user.add(movie2);
        user.add(movie3);
        user.add(movie4);
        user.add(movie5);
        user.add(movie6);


        String[] actual = user.findLast();
        String[] expected = {
                "Дефицит фантазии 6",
                "Дефицит фантазии 5",
                "Дефицит фантазии 4",
                "Дефицит фантазии 3",
                "Дефицит фантазии 2" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimitLessSizeArray2() {
        FilmManager user = new FilmManager(2);

        String movie5 = "Дефицит фантазии 5";
        String movie6 = "Дефицит фантазии 6";

        user.add(movie5);
        user.add(movie6);


        String[] actual = user.findLast();
        String[] expected = {
                "Дефицит фантазии 6",
                "Дефицит фантазии 5",
               };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimitAboveSizeArray1() {
        FilmManager user = new FilmManager();


        String movie1 = "Дефицит фантазии 1";
        String movie2 = "Дефицит фантазии 2";
        String movie3 = "Дефицит фантазии 3";


        user.add(movie1);
        user.add(movie2);
        user.add(movie3);



        String[] actual = user.findLast();
        String[] expected = {
                "Дефицит фантазии 3",
                "Дефицит фантазии 2",
                "Дефицит фантазии 1",
                 };
        Assertions.assertArrayEquals(expected, actual);
    }
}