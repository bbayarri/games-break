package repositories;

import data.Game;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GamesRepositoryTest {

    @Test
    public void get_should_return_games_list() {
        //Arrange
        GamesRepository gamesRepository = new GamesRepository();

        //Act
        List<Game> games = gamesRepository.get();

        //Assert
        assertEquals(13, games.size());
    }

    @Test
    public void get_by_id_with_valid_id_should_return_game() {
        //Arrange
        GamesRepository gamesRepository = new GamesRepository();
        Game expectedGame = new Game(1L, "Resident Evil 4", "2005", "Survival Horror", 350.50, "https://media.vandal.net/m/67022/resident-evil-4-20193420315720_1.jpg");

        //Act
        Game game = gamesRepository.getById(1L);

        //Assert
        assertEquals(expectedGame.getId(), game.getId());
        assertEquals(expectedGame.getName(), game.getName());
        assertEquals(expectedGame.getReleaseDate(), game.getReleaseDate());
        assertEquals(expectedGame.getGenre(), game.getGenre());
        assertEquals(expectedGame.getPrice(), game.getPrice());
        assertEquals(expectedGame.getPermalink(), game.getPermalink());
    }

}