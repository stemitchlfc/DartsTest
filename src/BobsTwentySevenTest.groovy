import org.junit.Test
import static org.junit.Assert.*

class BobsTwentySevenTest {

    @Test
    void display_starting_score(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.getCurrentScore(), 27)
    }

    @Test
    void start_on_double_one(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.getAimingDouble(), 1)
    }

    @Test
    void enter_score_get_int(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.getUserInput("1"), 1)
    }

    @Test
    void enter_score_2_get_int(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.getUserInput("2"), 2)
    }

    @Test
    void check_valid_score(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.isScoreValid(2), true)
    }

    @Test
    void check_invalid_score(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.isScoreValid(4), false)
    }

    @Test
    void invalid_score_go_again(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.isScoreValid(4), false)
    }









}
