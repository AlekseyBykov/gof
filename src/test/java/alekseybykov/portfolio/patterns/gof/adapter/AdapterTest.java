//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.adapter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
@DisplayName("Tests for Adapter Pattern")
class AdapterTest {

    private final String vgaSignal = "Video signal: RGB plus option H and V sync";
    private final String hdmiSignal = "Video signal: Maximum resolution limited by available bandwidth";

    @Test
    @DisplayName("Connect monitor with hdmi socket to vga socket through adapter")
    void testUseObjectWithAdapter() {

        VgaSocket vgaSocket = new SimpleVgaSocket();
        HdmiSocket socketAdapter = new SocketAdapter(vgaSocket);

        Monitor monitor = new Monitor();
        assertEquals(vgaSignal, monitor.show(socketAdapter));
    }

    @Test
    @DisplayName("Connect monitor with hdmi socket to native hdmi socket")
    void testUseObjectWithoutAdapter() {

        HdmiSocket hdmiSocket = new SimpleHdmiSocket();

        Monitor monitor = new Monitor();
        assertEquals(hdmiSignal, monitor.show(hdmiSocket));
    }

    // for simplification
    class Monitor {
        String show(HdmiSocket socket) {
            return socket.getVideoSignal();
        }
    }
}
