package com.techmanual.chapterthree.publishevent;

import org.springframework.context.ApplicationEvent;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/29<p>
// -------------------------------------------------------

public class SomeEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never <code>null</code>)
     */
    public SomeEvent(Object source) {
        super(source);
    }
}
