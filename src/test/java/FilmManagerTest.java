import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void testFindAll() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        String film1 = "Film 1";
        String film2 = "Film 2";
        String film3 = "Film 3";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
