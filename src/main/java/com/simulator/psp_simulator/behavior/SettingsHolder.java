package com.simulator.psp_simulator.behavior;

import com.simulator.psp_simulator.constants.Status;
import com.simulator.psp_simulator.dto.Settings;
import org.springframework.stereotype.Component;

@Component
public class SettingsHolder {
    private volatile Settings mode = new Settings(Status.NORMAL, 0); // 0 seconds delay means the simulator is healthy
    public Settings getMode() {
        return mode;
    }

    public void setMode(Settings next){
        this.mode = next;
    }
}
