import org.example.RadioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    @Test

    public void shouldSetRadioStationNumber() {
        RadioService number = new RadioService();

        number.setRadioStationNumber(8);

        int expected = 8;
        int actual = number.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {
        RadioService maxNumber = new RadioService();

        maxNumber.setRadioStationNumber(10);

        int expected = 0;
        int actual = maxNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMin() {
        RadioService maxNumber = new RadioService();

        maxNumber.setRadioStationNumber(-10);

        int expected = 0;
        int actual = maxNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTest() {
        RadioService nextNumber = new RadioService();

        nextNumber.setRadioStationNumber(8);
        nextNumber.next();

        int expected = 9;
        int actual = nextNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest() {
        RadioService nextNumber = new RadioService();

        nextNumber.setRadioStationNumber(9);
        nextNumber.next();

        int expected = 0;
        int actual = nextNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTest() {
        RadioService nextNumber = new RadioService(10);

        nextNumber.setRadioStationNumber(8);
        nextNumber.prev();

        int expected = 7;
        int actual = nextNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest() {
        RadioService nextNumber = new RadioService(10);

        nextNumber.setRadioStationNumber(0);
        nextNumber.prev();

        int expected = 9;
        int actual = nextNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationVolume() {
        RadioService volume = new RadioService();

        volume.setRadioStationVolume(8);

        int expected = 8;
        int actual = volume.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRadioStationVolumeAboveMax() {
        RadioService maxVolume = new RadioService();

        maxVolume.setRadioStationVolume(101);

        int expected = 0;
        int actual = maxVolume.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRadioStationVolumeAboveMin() {
        RadioService minNumber = new RadioService();

        minNumber.setRadioStationVolume(-10);

        int expected = 0;
        int actual = minNumber.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpTest() {
        RadioService nextVolume = new RadioService();


        nextVolume.nextVolume();

        int expected = 1;
        int actual = nextVolume.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpMaxTest() {
        RadioService maxVolume = new RadioService();

        maxVolume.setRadioStationVolume(100);
        maxVolume.nextVolume();

        int expected = 100;
        int actual = maxVolume.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTurnDownTest() {
        RadioService turnDown = new RadioService();

        turnDown.setRadioStationVolume(100);
        turnDown.prevVolume();

        int expected = 99;
        int actual = turnDown.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTurnDownMinTest() {
        RadioService turnDownMin = new RadioService();

        turnDownMin.setRadioStationVolume(0);
        turnDownMin.prevVolume();

        int expected = 0;
        int actual = turnDownMin.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }
}
