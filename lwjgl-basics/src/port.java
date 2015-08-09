/**
 * Copyright (c) 2012, Matt DesLauriers All rights reserved.
 *
 *	Redistribution and use in source and binary forms, with or without
 *	modification, are permitted provided that the following conditions are met:
 *
 *	* Redistributions of source code must retain the above copyright notice, this
 *	  list of conditions and the following disclaimer.
 *
 *	* Redistributions in binary
 *	  form must reproduce the above copyright notice, this list of conditions and
 *	  the following disclaimer in the documentation and/or other materials provided
 *	  with the distribution.
 *
 *	* Neither the name of the Matt DesLauriers nor the names
 *	  of his contributors may be used to endorse or promote products derived from
 *	  this software without specific prior written permission.
 *
 *	THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 *	AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 *	IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 *	ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 *	LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *	CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *	SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 *	INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 *	CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 *	ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *	POSSIBILITY OF SUCH DAMAGE.
 */

import static org.lwjgl.opengl.GL11.glClearColor;
import java.io.IOException;
import mdesl.graphics.Color;
import mdesl.graphics.SpriteBatch;
import mdesl.graphics.Texture;
import mdesl.graphics.TextureRegion;
import mdesl.graphics.text.BitmapFont; 
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;


public class port extends SimpleGame {

	public static void main(String[] args) throws LWJGLException {
		Game game = new port();
		game.setDisplayMode(640, 480, false);
		game.start();
	}

	Texture tex, tex2, tex3;
	TextureRegion tile;
	SpriteBatch batch;
	Texture fontTex;
	TextureRegion rect;
	
	float panX, panY, rot, zoom=1f;
	BitmapFont font;
	final float MOVE_SPEED = 10f;
	final float ZOOM_SPEED = 0.025f;
	final float ROT_SPEED = 0.05f;
	
	protected void create() throws LWJGLException {
		super.create();
		
		//Load some textures
		try {
			tex3 = new Texture(Util.getResource("res/null.png"), Texture.NEAREST);
			tex = new Texture(Util.getResource("res/tiles.png"), Texture.NEAREST);
			tex2 = new Texture(Util.getResource("res/ptsans_00.png"));
			tile = new TextureRegion(tex3, 128, 64, 64, 64);
			
			font = new BitmapFont(Util.getResource("res/ptsans.fnt"), Util.getResource("res/ptsans_00.png"));
			
			fontTex = new Texture(Util.getResource("res/ptsans_00.png"), Texture.NEAREST);
			
			//in Photoshop, we included a small white box at the bottom right of our font sheet
			//we will use this to draw lines and rectangles within the same batch as our text
			rect = new TextureRegion(fontTex, fontTex.getWidth()-2, fontTex.getHeight()-2, 1, 1);
			Display.setTitle("ÑóÉ½¸Û²âÊÔÄ£ÄâÆ÷");
		} catch (IOException e) {
			// ... do something here ...
			Sys.alert("Error", "Could not decode images!");
			e.printStackTrace();
			System.exit(0);
		}
		glClearColor(0.5f, .5f, .5f, 1f);
		//create our sprite batch
		batch = new SpriteBatch();
	}
	
	
	void drawRect(int x, int y, int width, int height, int thickness) {
		batch.draw(rect, x, y, width, thickness);
		batch.draw(rect, x, y, thickness, height);
		batch.draw(rect, x, y+height-thickness, width, thickness);
		batch.draw(rect, x+width-thickness, y, thickness, height);
	}
	
	void drawLine(int x1, int y1, int x2, int y2, int thickness) {
		int dx = x2-x1;
		int dy = y2-y1;
		float dist = (float)Math.sqrt(dx*dx + dy*dy);
		float rad = (float)Math.atan2(dy, dx);
		batch.draw(rect, x1, y1, dist, thickness, 0, 0, rad); 
	}
	
	protected void mousePressed(int x, int y, int button) {
		
	}

	protected void mouseWheelChanged(int delta) {
		
	}
	
	void drawGame() {
		//get the instance of the view matrix for our batch
		Matrix4f view = batch.getViewMatrix();
		
		//reset the matrix to identity, i.e. "no camera transform"
		view.setIdentity();
		
		//scale the view
		if (zoom != 1f) {
			view.scale(new Vector3f(zoom, zoom, 1f));
		}
		
		//pan the camera by translating the view matrix
		view.translate(new Vector2f(panX, panY));
		
		//after translation, we can rotate...
		if (rot!=0f) {
			//we want to rotate by a center origin point, so first we translate
			view.translate(new Vector2f(Display.getWidth()/2, Display.getHeight()/2));
			
			//then we rotate
			view.rotate(rot, new Vector3f(0, 0, 1));
			
			//then we translate back
			view.translate(new Vector2f(-Display.getWidth()/2, -Display.getHeight()/2));
		}
		
		//apply other transformations here...
		
		//update the new view matrix
		batch.updateUniforms();
		
		//start the sprite batch
		batch.begin();

		//draw a tile from our sprite sheet
		//batch.draw(tile, 10, 10);
		
		for(int dx=0; dx<=10000; dx+=20)
			for(int dy=0; dy<=10000; dy+=20){
				batch.draw(tile, 10+dx, 100+dy, 9, 18); //we can stretch it with a new width/height
			}

		//we can also draw a region of a Texture on the fly like so:
		//batch.drawRegion(tex, 0, 0, 32, 32, 	  //srcX, srcY, srcWidth, srcHeight
		//					   10, 250, 32, 32);  //dstX, dstY, dstWidth, dstHeight
		
		//tint batch red
		//batch.setColor(Color.RED); 
		//batch.draw(tex2, 0, 0, Display.getWidth(), Display.getHeight());
		
		//reset color
		batch.setColor(Color.WHITE);
		
		drawRect(10, 10, 100, 20, 2);
		
		batch.setColor(Color.BLUE);
		font.drawText(batch, "Control camera with WASD, UP/DOWN and LEFT/RIGHT", 100, 100);
		//finish the sprite batch and push the tiles to the GPU
		batch.end();
	}
	
	void drawHUD() {
		//draw the text with identity matrix, i.e. no camera transformation
		batch.getViewMatrix().setIdentity();
		batch.updateUniforms();
		
		batch.begin();
		// ... render any hud elements

		batch.end();
	}
	public double ScreenX=0;
	public double ScreenY=0;
	protected void render() throws LWJGLException {
		super.render();		
		
		if (Keyboard.isKeyDown(Keyboard.KEY_LEFT))
		{
			panX += 10*MOVE_SPEED;
			ScreenX -= 10*MOVE_SPEED;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT))
		{
			panX -= 10*MOVE_SPEED;
			ScreenX += 10*MOVE_SPEED;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_DOWN))
		{
			panY -= 10*MOVE_SPEED;
			ScreenY += 10*MOVE_SPEED;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_UP))
		{
			panY += 10*MOVE_SPEED;
			ScreenY -= 10*MOVE_SPEED;
		}
		
		if (Keyboard.isKeyDown(Keyboard.KEY_Z))
		{
			zoom += 2*ZOOM_SPEED;
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_X))
		{
			zoom -= 2*ZOOM_SPEED;
		}

		if(Mouse.isButtonDown(0)){
			double DragX=Mouse.getEventDX();
			double DragY=Mouse.getEventDY();
			if((Math.abs(DragX)+Math.abs(DragY)>10)){
				panX += DragX/zoom;
				ScreenX -= DragX/zoom;
				panY -= DragY/zoom;
				ScreenY += DragY/zoom;
			}
		}
		
		if(Keyboard.isKeyDown(Keyboard.KEY_C)||Keyboard.isKeyDown(Keyboard.KEY_V)||(Mouse.getDWheel()!=0)){
			double Old_zoom=zoom;
			if(Keyboard.isKeyDown(Keyboard.KEY_C)) zoom += 2*ZOOM_SPEED;
			else if(Keyboard.isKeyDown(Keyboard.KEY_V)) zoom-=2*ZOOM_SPEED;
			else zoom+=Mouse.getEventDWheel()*ZOOM_SPEED/20;
			double Zoomdx=(GetLogicalX()-ScreenX)-(GetLogicalX()-ScreenX)*Old_zoom/zoom;
			double Zoomdy=(GetLogicalY()-ScreenY)-(GetLogicalY()-ScreenY)*Old_zoom/zoom;
			ScreenX+=Zoomdx;
			ScreenY+=Zoomdy;
			panX-=Zoomdx;
			panY-=Zoomdy;
		}
		
		if(Keyboard.isKeyDown(Keyboard.KEY_R)){
			ScreenX=0;
			ScreenY=0;
			panX=0;
			panY=0;
            zoom=1;
            Display.setTitle("ÑóÉ½¸Û²âÊÔÄ£ÄâÆ÷");
		}
		
		zoom = Math.max(0.15f, zoom);
		
		if(org.lwjgl.input.Mouse.getEventButton()>0){
			Display.setTitle(GetLogicalX()+"/"+GetLogicalY());
		}
		
		/*
		if (Keyboard.isKeyDown(Keyboard.KEY_LEFT))
			rot -= ROT_SPEED;
		if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT))
			rot += ROT_SPEED;
		*/
		
		drawGame();
		
		drawHUD();
	}
	
	public int GetLogicalX(){
		return (int)(ScreenX+(org.lwjgl.input.Mouse.getX())/zoom);
	}
	
	public double GetLogicalY(){
		return (int)(ScreenY+(Display.getHeight()-org.lwjgl.input.Mouse.getY())/zoom);
	}
	protected void resize() throws LWJGLException {
		super.resize();
		batch.resize(Display.getWidth(), Display.getHeight());
	}
	
}