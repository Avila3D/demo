import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatingServiceTest {

    @Test
    void dateIdeas() {
        DatingService datingService = new DatingService();

        assertEquals("go to church", datingService.dateIdeas("Sunday"));
        assertEquals("go to FHE", datingService.dateIdeas("Monday"));
    }

}