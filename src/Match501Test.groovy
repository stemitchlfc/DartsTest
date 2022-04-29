import org.junit.Test;
import static org.junit.Assert.*


class Match501Test {


    @Test
    void player1_starts_on_501() {
        Match501 player1 = new Match501("Ste")
        assertEquals(player1.getStartingScoreMatch(), 501)
    }

    @Test
    void player2_starts_on_501() {
        Match501 player2 = new Match501("Paul")
        assertEquals(player2.getStartingScoreMatch(), 501)
    }

    @Test
    void get_user_input_integer() {
        Match501 player1 = new Match501("Ste")
        Match501 player2 = new Match501("Paul")
        player1.removeScoreMatch(21)
        player2.removeScoreMatch(55)
        assertEquals(player1.getCurrentScoreMatch(), 480)
        assertEquals(player2.getCurrentScoreMatch(), 446)
    }

    @Test
    void is_score_valid() {
        Match501 player1 = new Match501("Ste")
        Match501 player2 = new Match501("Paul")
        assertEquals(player1.removeScoreMatch(181), "Invalid Score")
        assertEquals(player2.removeScoreMatch(181), "Invalid Score")
    }

    @Test
    void score_more_than_current_score() {
        Match501 player1 = new Match501("Ste")
        Match501 player2 = new Match501("Paul")
        player1.removeScoreMatch(180)
        player2.removeScoreMatch(180)
        assertEquals(player1.getCurrentScoreMatch(), 321)
        assertEquals(player2.getCurrentScoreMatch(), 321)
        player1.removeScoreMatch(180)
        player2.removeScoreMatch(180)
        assertEquals(player1.getCurrentScoreMatch(), 141)
        assertEquals(player2.getCurrentScoreMatch(), 141)
        player1.removeScoreMatch(150)
        player2.removeScoreMatch(150)
    }

    @Test
    void score_after_invalid_score() {
        Match501 player1 = new Match501("Ste")
        Match501 player2 = new Match501("Paul")
        assertEquals(player1.removeScoreMatch(181), "Invalid Score")
        assertEquals(player2.removeScoreMatch(181), "Invalid Score")
        player1.removeScoreMatch(180)
        player2.removeScoreMatch(180)
        assertEquals(player1.getCurrentScoreMatch(), 321)
        assertEquals(player2.getCurrentScoreMatch(), 321)
    }

    @Test
    void check_if_on_finish() {
        Match501 player1 = new Match501("Ste")
        Match501 player2 = new Match501("Paul")
        player1.removeScoreMatch(180)
        player2.removeScoreMatch(180)
        assertEquals(player1.getCurrentScoreMatch(), 321)
        assertEquals(player2.getCurrentScoreMatch(), 321)
        player1.removeScoreMatch(180)
        player2.removeScoreMatch(100)
        assertEquals(player1.getCurrentScoreMatch(), 141)
        assertEquals(player2.getCurrentScoreMatch(), 221)
        player1.removeScoreMatch(80)
        player2.removeScoreMatch(62)
        assertEquals(player1.isFinishAvailable(), true)
        assertEquals(player2.isFinishAvailable(), false)
    }

    @Test
    void score_goes_to_zero() {
        Match501 player1 = new Match501("Ste")
        Match501 player2 = new Match501("Paul")
        player1.removeScoreMatch(180)
        player2.removeScoreMatch(180)
        player1.removeScoreMatch(180)
        player2.removeScoreMatch(180)
        player1.removeScoreMatch(141)
        player2.removeScoreMatch(141)
        assertEquals(player1.getCurrentScoreMatch(), 0)
        assertEquals(player2.getCurrentScoreMatch(), 0)
    }

    @Test
    void confirms_leg_is_complete() {
        Match501 player1 = new Match501("Ste")
        Match501 player2 = new Match501("Paul")
        player1.removeScoreMatch(180)
        player2.removeScoreMatch(180)
        player1.removeScoreMatch(180)
        player2.removeScoreMatch(180)
        player1.removeScoreMatch(100)
        player2.removeScoreMatch(141)
        assertEquals(player1.getCurrentScoreMatch(), 41)
        assertEquals(player2.getCurrentScoreMatch(), 0)
        assertEquals(player1.legCompleteMatch(), false)
        assertEquals(player2.legCompleteMatch(), true)
    }

    @Test
    void ask_how_many_darts_at_double() {
        Match501 player1 = new Match501("Ste")
        Match501 player2 = new Match501("Paul")
        player1.removeScoreMatch(180)
        player2.removeScoreMatch(180)
        player1.removeScoreMatch(180)
        player2.removeScoreMatch(180)
        player1.removeScoreMatch(100)
        player2.removeScoreMatch(141)
        assertEquals(player1.getCurrentScoreMatch(), 41)
        assertEquals(player2.getCurrentScoreMatch(), 0)
        assertEquals(player2.dartsAtDoubleMatch(3), "3")
    }

    @Test
    void finish_less_than_four_darts() {
        Match501 player1 = new Match501("Ste")
        Match501 player2 = new Match501("Paul")
        assertEquals(player1.isDoubleValidMatch(4), false)
        assertEquals(player2.isDoubleValidMatch(2), true)
    }

    @Test
    void counts_number_of_visits() {
        Match501 player1 = new Match501("Ste")
        Match501 player2 = new Match501("Paul")
        player1.removeScoreMatch(120)
        player2.removeScoreMatch(120)
        player1.removeScoreMatch(120)
        player2.removeScoreMatch(120)
        player1.removeScoreMatch(120)
        assertEquals(player1.getDartsThrownMatch(), 9)
        assertEquals(player2.getDartsThrownMatch(), 6)
    }

    @Test
    void number_of_visits_and_darts_at_double() {
        Match501 player1 = new Match501("Ste")
        Match501 player2 = new Match501("Paul")
        player1.removeScoreMatch(100)
        player2.removeScoreMatch(100)
        player1.removeScoreMatch(100)
        player2.removeScoreMatch(100)
        player1.removeScoreMatch(100)
        player2.removeScoreMatch(100)
        assertEquals(player1.getCurrentScoreMatch(), 201)
        assertEquals(player2.getCurrentScoreMatch(), 201)
        assertEquals(player1.getDartsThrownMatch(), 9)
        assertEquals(player2.getDartsThrownMatch(), 9)
        player1.removeScoreMatch(100)
        player2.removeScoreMatch(100)
        player1.removeScoreMatch(61)
        player2.removeScoreMatch(70)
        player1.removeScoreMatch(20)
        player2.removeScoreMatch(31)
        assertEquals(player1.getCurrentScoreMatch(), 20)
        assertEquals(player2.getCurrentScoreMatch(), 0)
        assertEquals(player1.getDartsThrownMatch(), 18)
        assertEquals(player2.getDartsThrownMatch(), 18)
        assertEquals(player1.legCompleteMatch(), false)
        assertEquals(player2.legCompleteMatch(), true)
        player2.dartsAtDoubleMatch(2)
        assertEquals(player2.totalDartsAtLegMatch(), 20)
    }
}