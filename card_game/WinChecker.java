package card_game;

import card_game.*;
import java.util.*;

public class WinChecker {

  private Player player1;
  private Player player2;
  private ArrayList<Player> winners = new ArrayList<Player>();

  public void setPlayers(Player player1, Player player2){
    this.player1 = player1;
    this.player2 = player2;
  }

  public Player checkForWin(){
    // checkForPrial(player1);
    // checkForPrial(player2);
    if(checkForPrial(player1))
    {
      return player1;
    }
    return player2;


    // if(winners.size() > 0) {
    //   if (winners.size() == 1) {
    //     return winners.get(0);
    //   }
    //   else {
    //     // If both players have a Prial, the player whose Prial is of the highest number wins. This version has Ace as low. Could add in to have 3 as the top number which is a special rule for 3 card brag.
    //     Map<Integer,Enum>map=new HashMap<>();
    //     map.put(player1.getHand()[0].getNumber(),player1.getHand()[1].getSuit());
    //     map.put(player2.getHand()[0].getNumber(),player2.getHand()[1].getSuit());
    //     int max = Collections.max(map.keySet());
    //     if(player1.getHand()[0].getNumber()==max){
    //       return player1;
    //     }else{
    //       return player2;
    //     }

    //   }
    // }

    // return null;
  }

  public boolean checkForPrial(Player player){
    Card[] hand = player.getHand();
    if (checkHand(hand))
    {
      winners.add(player);
      return true;
    }
    return false;
  }

  private boolean checkHand(Card[] array){
    boolean duplicates = false;
    for (int j=0;j<array.length ;j++ ) {
      for (int k=j+1;k<array.length ;k++ ) {
        if(array[k].equals(array[j])){
          duplicates = true;
        }else{
          duplicates = false;
        } 
      }
    }
    return duplicates;
  }

}