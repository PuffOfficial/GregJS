package com.gregjs.integration.kubejs;

import com.gregjs.integration.kubejs.events.GJSRegistryEvent;
import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.Extra;
import dev.latvian.mods.kubejs.event.EventHandler;

public class GregJSStartupEvents {
    EventGroup GROUP = EventGroup.of("GregJSStartupEvents");

    EventHandler MAIN = GROUP.startup("main", () -> GJSRegistryEvent.class);
}
