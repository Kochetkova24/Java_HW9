import org.example.radioService;
import org.example.radioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class radioServiceTest {
    @Test

    public void shouldSetRadioStationNumber() {
        radioService number = new radioService();

        number.setRadioStationNumber(8);

        int expected = 8;
        int actual = number.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {
        radioService maxNumber = new radioService();

        maxNumber.setRadioStationNumber(10);

        int expected = 0;
        int actual = maxNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMin() {
        radioService maxNumber = new radioService();

        maxNumber.setRadioStationNumber(-10);

        int expected = 0;
        int actual = maxNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTest() {
        radioService nextNumber = new radioService();

        nextNumber.setRadioStationNumber(8);
        nextNumber.next();

        int expected = 9;
        int actual = nextNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest() {
        radioService nextNumber = new radioService();

        nextNumber.setRadioStationNumber(9);
        nextNumber.next();

        int expected = 0;
        int actual = nextNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTest() {
        radioService nextNumber = new radioService();

        nextNumber.setRadioStationNumber(8);
        nextNumber.prev();

        int expected = 7;
        int actual = nextNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest() {
        radioService nextNumber = new radioService();

        nextNumber.setRadioStationNumber(0);
        nextNumber.prev();

        int expected = 9;
        int actual = nextNumber.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationVolume() {
        radioService volume = new radioService();

        volume.setRadioStationVolume(8);

        int expected = 8;
        int actual = volume.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRadioStationVolumeAboveMax() {
        radioService maxVolume = new radioService();

        maxVolume.setRadioStationVolume(101);

        int expected = 0;
        int actual = maxVolume.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRadioStationVolumeAboveMin() {
        radioService minNumber = new radioService();

        minNumber.setRadioStationVolume(-10);

        int expected = 0;
        int actual = minNumber.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpTest() {
        radioService nextVolume = new radioService();


        nextVolume.nextVolume();

        int expected = 1;
        int actual = nextVolume.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpMaxTest() {
        radioService maxVolume = new radioService();

        maxVolume.setRadioStationVolume(100);
        maxVolume.nextVolume();

        int expected = 100;
        int actual = maxVolume.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTurnDownTest() {
        radioService turnDown = new radioService();

        turnDown.setRadioStationVolume(100);
        turnDown.prevVolume();

        int expected = 99;
        int actual = turnDown.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTurnDownMinTest() {
        radioService turnDownMin = new radioService();

        turnDownMin.setRadioStationVolume(0);
        turnDownMin.prevVolume();

        int expected = 0;
        int actual = turnDownMin.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }
}
