package com.giri.firstSpringframework;

import com.giri.firstSpringframework.game.GameRunner;
import com.giri.firstSpringframework.game.GamingConsole;
import com.giri.firstSpringframework.game.PacMan;
import com.giri.firstSpringframework.game.SuperContra;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("package com.giri.firstSpringframework.game")
public class App03GamingSpringBeans
{

//        @Bean
//        public GamingConsole game()
//        {
//            var game = new SuperContra();
//            return game;
//        }

//        @Bean
//        public GameRunner gameRunner(GamingConsole game)
//        {
//            var gameRunner = new GameRunner(game);
//            return gameRunner;
//        }

    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext
                        (App03GamingSpringBeans.class);
        System.out.println("parameter");
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();

    }
}
