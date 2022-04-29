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
        assertEquals(B27.userInputB27(1), 1)
    }

    @Test
    void enter_score_2_get_int(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.userInputB27(2), 2)
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
        assertEquals(B27.getAimingDouble(), 1)
        assertEquals(B27.isScoreValid(4), false)
        assertEquals(B27.getAimingDouble(), 1)
        assertEquals(B27.userInputB27(1), 1)
        assertEquals(B27.getAimingDouble(), 2)
        assertEquals(B27.userInputB27(1), 1)
        assertEquals(B27.getAimingDouble(), 3)
        assertEquals(B27.isScoreValid(4), false)
        assertEquals(B27.getAimingDouble(), 3)
    }

    @Test
    void after_valid_next_double(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.userInputB27(2), 2)
        assertEquals(B27.userInputB27(2), 2)
        assertEquals(B27.userInputB27(2), 2)
        assertEquals(B27.getAimingDouble(), 4)
    }

    @Test
    void add_score_with_doubles_hit(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.userInputB27(2), 2)
        assertEquals(B27.getCurrentScore(), 31)
        assertEquals(B27.userInputB27(2), 2)
        assertEquals(B27.getCurrentScore(), 39)
    }

    @Test
    void add_score_with_doubles_hit_not_hit(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.userInputB27(0), 0)
        assertEquals(B27.getCurrentScore(), 25)
        assertEquals(B27.userInputB27(0), 0)
        assertEquals(B27.getCurrentScore(), 21)
        assertEquals(B27.userInputB27(1), 1)
        assertEquals(B27.getCurrentScore(), 27)
        assertEquals(B27.userInputB27(2), 2)
        assertEquals(B27.getCurrentScore(), 43)
        assertEquals(B27.userInputB27(0), 0)
        assertEquals(B27.getCurrentScore(), 33)
    }

    @Test
    void scores_drop_below_0(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        B27.userInputB27(0)
        B27.userInputB27(0)
        B27.userInputB27(0)
        B27.userInputB27(0)
        assertEquals(B27.getCurrentScore(), 7)
        B27.userInputB27(0)
        assertEquals(B27.isGameOver(), true)
        assertEquals(B27.getCurrentScore(), -3)
    }

    @Test
    void get_to_bull(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        assertEquals(B27.getAimingDouble(), 4)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        assertEquals(B27.getAimingDouble(), 19)
        B27.userInputB27(1)
        assertEquals(B27.getAimingDouble(), 20)
        B27.userInputB27(1)
        assertEquals(B27.isOnBull(), true)
        assertEquals(B27.getBullInputB27(1), 497)
    }

    @Test
    void bull_aimed_for(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        assertEquals(B27.getAimingDouble(), 4)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        B27.userInputB27(1)
        assertEquals(B27.getAimingDouble(), 19)
        B27.userInputB27(1)
        assertEquals(B27.getAimingDouble(), 20)
        assertEquals(B27.isOnBull(), false)
        B27.userInputB27(1)
        assertEquals(B27.isOnBull(), true)
    }

    @Test
    void shot_on_bull(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.getBullInputB27(2), 127)
    }

    @Test
    void shot_on_bull_missed(){
        BobsTwentySeven B27 = new BobsTwentySeven()
        assertEquals(B27.getBullInputB27(0), -23)
    }





}
