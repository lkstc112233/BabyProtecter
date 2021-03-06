package net.muststudio.babyprotecter;

import net.muststudio.util.guiitemlib.util.BitmapHolder;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

public class JimmyAlarm extends Activity {
	private class view extends View {
		public view(Context context) {
			super(context);
		}

		@SuppressLint("DrawAllocation")
		@Override
		public void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			Rect rect = new Rect(0, 0, getWidth(), getHeight());
			canvas.drawBitmap(BitmapHolder.getInstance().getBitmap(R.drawable.medicine), null,
					rect, null);
		}
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new view(this));
		JimmyAlarmer.init(this);
		JimmyAlarmer.startAlarm();
		BitmapHolder.getInstance(this);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		JimmyAlarmer.stopAlarm();
	}

}
