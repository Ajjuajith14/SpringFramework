package com.giri.firstSpringframework;

import com.giri.firstSpringframework.game.GameRunner;
import com.giri.firstSpringframework.game.PacMan;
import com.giri.firstSpringframework.game.SuperContra;

public class App01GamingBasic
{
    public static void main(String[] args) {

       // var game = new MarioGame();
        var game = new SuperContra();
        //var game = new SuperContra();
        var gameRunner = new GameRunner(game);
        gameRunner.run();



    }
}
