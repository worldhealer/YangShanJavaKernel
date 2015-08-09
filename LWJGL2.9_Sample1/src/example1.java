import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
/*
  * Copyright (c) 2008-2011, Matthias Mann
  *
  * All rights reserved.
  *
  * Redistribution and use in source and binary forms, with or without
  * modification, are permitted provided that the following conditions are met:
  *
  *     * Redistributions of source code must retain the above copyright notice,
  *       this list of conditions and the following disclaimer.
  *     * Redistributions in binary form must reproduce the above copyright
  *       notice, this list of conditions and the following disclaimer in the
  *       documentation and/or other materials provided with the distribution.
  *     * Neither the name of Matthias Mann nor the names of its contributors may
  *       be used to endorse or promote products derived from this software
  *       without specific prior written permission.
  *
  * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
  * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
  * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
  * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
  * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
  * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
  * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
  * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
  * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
  * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
  * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
  */

  
  /**
   * @author Matthias Mann
   */
public class example1{
	
	  private static boolean closeRequested = false;
	  private final static AtomicReference<Dimension> newCanvasSize = new AtomicReference<Dimension>();

  public static void main(String[] args)
  {
     Frame frame = new Frame("Test");
     frame.setLayout(new BorderLayout());
     final Canvas canvas = new Canvas();

     canvas.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e)
        { newCanvasSize.set(canvas.getSize()); }
     });
     
     frame.addWindowFocusListener(new WindowAdapter() {
        @Override
        public void windowGainedFocus(WindowEvent e)
        { canvas.requestFocusInWindow(); }
     });
     
     frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e)
        { closeRequested = true; }
     });
     
     frame.add(canvas, BorderLayout.CENTER);

     try {
        Display.setParent(canvas);
        Display.setVSyncEnabled(true);
        
        frame.setPreferredSize(new Dimension(1024, 786));
        frame.setMinimumSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
        Display.create();

        //LWJGLRenderer renderer = new LWJGLRenderer();

        Dimension newDim;
        
        while(!Display.isCloseRequested() && !closeRequested)
        {
           newDim = newCanvasSize.getAndSet(null);
           
           if (newDim != null)
           {
              GL11.glViewport(0, 0, newDim.width, newDim.height);
              //renderer.syncViewportSize();
           }
           
           GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
           Display.update();
        }

        Display.destroy();
        frame.dispose();
        System.exit(0);
     } catch (LWJGLException e) {
        e.printStackTrace();
     } catch (Exception e) {
        e.printStackTrace();
     }
  }
}
  