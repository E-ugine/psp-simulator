package com.simulator.psp_simulator.controller;


import com.simulator.psp_simulator.behavior.SettingsHolder;
import com.simulator.psp_simulator.dto.Settings;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/settings")
public class SettingsController {
    private final SettingsHolder holder;

    public  SettingsController(SettingsHolder holder){
        this.holder = holder;
    }

    @GetMapping()
    public Settings getSettings(){
        return holder.getMode();
    }

    @PutMapping()
    public  Settings updateSettings(@RequestBody Settings next){
        holder.setMode(next);
        return next;
    }
}
