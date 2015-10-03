package org.freehep.graphicsio;

import java.awt.Shape;

/**
 * Allows to include links in drawings.
 *  
 * @author cabac
 *
 */
public interface HyperrefGraphics {

    /**
     * Include a link statement start tag.
     * 
     * @param link
     */
    public abstract void drawLink(Shape rect, String link);

    /** 
     * Include a link end tag.
     */
    public abstract void drawLinkEnd();

}