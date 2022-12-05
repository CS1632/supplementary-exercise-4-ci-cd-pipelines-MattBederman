package edu.pitt.cs;

import org.junit.Test;
import org.mockito.*;
import static org.mockito.Mockito.*;
public class RockPaperScissorsTest 
{
    /**
 * Preconditions: Create a PaperPlayer p1.
 *                Create a RockPlayer p2.
 *                Create a ScoreBoard sb.
 *                Create a RockPaperScissors game rps using p1, p2, sb.
 * Execution steps: Call rps.play(5).
 * Postconditions: 5 p1 wins, 0 p2 wins, and 0 draws are posted on ScoreBoard sb.
 */
    @Test
    public void testPapervsRock5() 
    {
        PaperPlayer p1 = Mockito.mock(PaperPlayer.class);
        Mockito.when(p1.throwHand()).thenReturn(Hand.PAPER);
        
        RockPlayer p2 = Mockito.mock(RockPlayer.class);
        Mockito.when(p2.throwHand()).thenReturn(Hand.ROCK);
        
        ScoreBoard sb = Mockito.mock(ScoreBoard.class);
        
        RockPaperScissors rps = new RockPaperScissors(p1, p2, sb);
        
        rps.play(5);
        
        Mockito.verify(sb, times(5)).p1Win();
        Mockito.verify(sb, times(0)).p2Win();
        Mockito.verify(sb, times(0)).draw();

        Mockito.verify(p1, times(5)).throwHand();
        Mockito.verify(p2, times(5)).throwHand();
    }
}
