package pages.SwitchToPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class FramesPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(FramesPage.class);
    public static FramesPage instance;

    private FramesPage() {
    }

    public static FramesPage getInstance() {
        if (instance == null) {
            instance = new FramesPage();
        }
        return instance;
    }
}
