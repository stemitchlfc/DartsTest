import org.junit.Ignore
import org.junit.Test
import org.junit.jupiter.api.Disabled

import static org.junit.Assert.*


class FiveZeroOneTest {


    @Test
    void starting_score_shown() {
        FiveZeroOne game501 = new FiveZeroOne()
        assertEquals(game501.getStartingScore(), 501)
    }

    @Test
    void get_user_input_integer() {
        FiveZeroOne game501 = new FiveZeroOne()
        game501.removeScore(21)
        assertEquals(game501.getCurrentScore(), 480)
        game501.removeScore(120)
        assertEquals(game501.getCurrentScore(), 360)
    }

    @Test
    void is_score_valid() {
        FiveZeroOne game501 = new FiveZeroOne()
        assertEquals(game501.removeScore(181), "Invalid Score")
    }

    @Test
    void is_score_less_than_remaining(){
        FiveZeroOne game501 = new FiveZeroOne()
        game501.removeScore(180)
        assertEquals(game501.getCurrentScore(), 321)
        game501.removeScore(180)
        assertEquals(game501.getCurrentScore(), 141)
        assertEquals(game501.removeScore(180), "Invalid Score")
    }

    @Test
    void after_invalid_score(){
        FiveZeroOne game501 = new FiveZeroOne()
        assertEquals(game501.removeScore(181), "Invalid Score")
        game501.removeScore(21)
        assertEquals(game501.getCurrentScore(), 480)
    }

    @Test
    void check_if_on_finish(){
        FiveZeroOne game501 = new FiveZeroOne()
        game501.removeScore(120)
        assertEquals(game501.getCurrentScore(), 381)
        game501.removeScore(120)
        assertEquals(game501.getCurrentScore(), 261)
        game501.removeScore(120)
        assertEquals(game501.getCurrentScore(), 141)
        assertEquals(game501.isOnFinish(), true)
    }

    @Test
    void check_if_not_on_finish(){
        FiveZeroOne game501 = new FiveZeroOne()
        game501.removeScore(120)
        assertEquals(game501.getCurrentScore(), 381)
        game501.removeScore(120)
        assertEquals(game501.getCurrentScore(), 261)
        game501.removeScore(92)
        assertEquals(game501.getCurrentScore(), 169)
        assertEquals(game501.isOnFinish(), false)
    }

    @Test
    void score_goes_to_zero(){
        FiveZeroOne game501 = new FiveZeroOne()
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(21)
        assertEquals(game501.getCurrentScore(), 0)
    }

    @Test
    void confirms_leg_is_complete(){
        FiveZeroOne game501 = new FiveZeroOne()
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(21)
        assertEquals(game501.legComplete(), true)
    }

    @Test
    void confirms_leg_is_not_complete(){
        FiveZeroOne game501 = new FiveZeroOne()
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        assertEquals(game501.legComplete(), false)
    }

    @Test

    void ask_how_many_darts_at_double(){
        FiveZeroOne game501 = new FiveZeroOne()
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(21)
        assertEquals(game501.dartsAtDouble(2), "2")
    }

    @Test
    void finish_less_than_four_darts(){
        FiveZeroOne game501 = new FiveZeroOne()
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(21)
        assertEquals(game501.dartsAtDouble(4), "Invalid Score")
    }

    @Test
    void counts_number_of_visits(){
        FiveZeroOne game501 = new FiveZeroOne()
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        assertEquals(game501.getDartsThrown(), 9)
    }

    @Test
    void number_of_visits_and_darts_at_double(){
        FiveZeroOne game501 = new FiveZeroOne()
        game501.removeScore(120)
        game501.removeScore(120)
        game501.removeScore(120)
        assertEquals(game501.getDartsThrown(), 9)
        game501.removeScore(100)
        game501.removeScore(41)
        game501.removeScore(0)
        game501.removeScore(0)
        assertEquals(game501.getDartsThrown(), 21)
        assertEquals(game501.getCurrentScore(), 0)
        assertEquals(game501.legComplete(), true)
        assertEquals(game501.dartsAtDouble(2), "2")
        assertEquals(game501.totalDartsForLeg(), 23)
    }
}