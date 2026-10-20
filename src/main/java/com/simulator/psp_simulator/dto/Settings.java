package com.simulator.psp_simulator.dto;
import com.simulator.psp_simulator.constants.Status;



// This is the settings message for the simulator.
// The body that goes into the control panel
public record Settings(Status status, int delaySeconds) {
}
