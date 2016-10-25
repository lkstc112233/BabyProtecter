package net.muststudio.babyprotecter.gui;

import android.graphics.Canvas;
import android.graphics.Paint;
import net.muststudio.babyprotecter.JimmyActivity;
import net.muststudio.util.guiitemlib.ui.GuiItem;

public class DebugGuiItem extends GuiItem {

	@Override
	public void draw(Canvas canvas) {
		Paint paint = new Paint();
		paint.setColor(-1);
		int dp = 30;
		paint.setTextSize(dp);
		int y = 0;
		canvas.drawText("SensorValues:", 0, y += dp, paint);
		canvas.drawText("AccelerometerValues:", 0, y += dp, paint);
		canvas.drawText(
				"x:" + Double.toString(JimmyActivity.getActivity().sensorAccelerometerValues.x), 0,
				y += dp, paint);
		canvas.drawText(
				"y:" + Double.toString(JimmyActivity.getActivity().sensorAccelerometerValues.y), 0,
				y += dp, paint);
		canvas.drawText(
				"z:" + Double.toString(JimmyActivity.getActivity().sensorAccelerometerValues.z), 0,
				y += dp, paint);
		canvas.drawText("MagnetometerValues:", 0, y += dp, paint);
		canvas.drawText(
				"x:" + Double.toString(JimmyActivity.getActivity().sensorMagnetometerValues.x), 0,
				y += dp, paint);
		canvas.drawText(
				"y:" + Double.toString(JimmyActivity.getActivity().sensorMagnetometerValues.y), 0,
				y += dp, paint);
		canvas.drawText(
				"z:" + Double.toString(JimmyActivity.getActivity().sensorMagnetometerValues.z), 0,
				y += dp, paint);
		canvas.drawText("GyroscopeValues:", 0, y += dp, paint);
		canvas.drawText(
				"x:" + Double.toString(JimmyActivity.getActivity().sensorGyroscopeValues.x), 0,
				y += dp, paint);
		canvas.drawText(
				"y:" + Double.toString(JimmyActivity.getActivity().sensorGyroscopeValues.y), 0,
				y += dp, paint);
		canvas.drawText(
				"z:" + Double.toString(JimmyActivity.getActivity().sensorGyroscopeValues.z), 0,
				y += dp, paint);
		canvas.drawText(
				"AmbientTemperature:"
						+ Double.toString(JimmyActivity.getActivity().sensorAmbientTemperature), 0,
				y += dp, paint);
		canvas.drawText(
				"IRTemperature:" + Double.toString(JimmyActivity.getActivity().sensorIrTemperature),
				0, y += dp, paint);
		canvas.drawText("OrientationValues:", 0, y += dp, paint);
		canvas.drawText(
				"x:" + Float.toString(JimmyActivity.getActivity().sensorOrientationValuesf[0]), 0,
				y += dp, paint);
		canvas.drawText(
				"y:" + Float.toString(JimmyActivity.getActivity().sensorOrientationValuesf[1]), 0,
				y += dp, paint);
		canvas.drawText(
				"z:" + Float.toString(JimmyActivity.getActivity().sensorOrientationValuesf[2]), 0,
				y += dp, paint);

		y = 0;

		canvas.drawText("PhoneValues:", 400, y += dp, paint);
		canvas.drawText("AccelerometerValues:", 400, y += dp, paint);
		canvas.drawText(
				"x:" + Float.toString(JimmyActivity.getActivity().phoneAccelerometerValues[0]),
				400, y += dp, paint);
		canvas.drawText(
				"y:" + Float.toString(JimmyActivity.getActivity().phoneAccelerometerValues[1]),
				400, y += dp, paint);
		canvas.drawText(
				"z:" + Float.toString(JimmyActivity.getActivity().phoneAccelerometerValues[2]),
				400, y += dp, paint);
		canvas.drawText("MagnetometerValues:", 400, y += dp, paint);
		canvas.drawText(
				"x:" + Float.toString(JimmyActivity.getActivity().phoneMagneticFieldValues[0]),
				400, y += dp, paint);
		canvas.drawText(
				"y:" + Float.toString(JimmyActivity.getActivity().phoneMagneticFieldValues[1]),
				400, y += dp, paint);
		canvas.drawText(
				"z:" + Float.toString(JimmyActivity.getActivity().phoneMagneticFieldValues[2]),
				400, y += dp, paint);
		// canvas.drawText("OrientationValues:", 400, y += dp, paint);
		// canvas.drawText(
		// "x*sin(theta/2)"
		// + Float.toString(JimmyActivity.getActivity().phoneRotationValues[0]),
		// 400,
		// y += dp, paint);
		// canvas.drawText(
		// "y*sin(theta/2)"
		// + Float.toString(JimmyActivity.getActivity().phoneRotationValues[1]),
		// 400,
		// y += dp, paint);
		// canvas.drawText(
		// "z*sin(theta/2)"
		// + Float.toString(JimmyActivity.getActivity().phoneRotationValues[2]),
		// 400,
		// y += dp, paint);
		// canvas.drawText(
		// "cos(theta/2)" +
		// Float.toString(JimmyActivity.getActivity().phoneRotationValues[3]),
		// 400, y += dp, paint);
		canvas.drawText("MISSING", 400, y += dp, paint);
		canvas.drawText("OrientationValues:", 400, y += dp, paint);
		canvas.drawText(
				"x:" + Float.toString(JimmyActivity.getActivity().phoneOrientationValues[0]), 400,
				y += dp, paint);
		canvas.drawText(
				"y:" + Float.toString(JimmyActivity.getActivity().phoneOrientationValues[1]), 400,
				y += dp, paint);
		canvas.drawText(
				"z:" + Float.toString(JimmyActivity.getActivity().phoneOrientationValues[2]), 400,
				y += dp, paint);
		// canvas.drawText("LinearAccelerometerValues:", 400, y += dp, paint);
		// canvas.drawText(
		// "x:"
		// +
		// Float.toString(JimmyActivity.getActivity().phoneLinearAccelerometerValues[0]),
		// 400, y += dp, paint);
		// canvas.drawText(
		// "y:"
		// +
		// Float.toString(JimmyActivity.getActivity().phoneLinearAccelerometerValues[1]),
		// 400, y += dp, paint);
		// canvas.drawText(
		// "z:"
		// +
		// Float.toString(JimmyActivity.getActivity().phoneLinearAccelerometerValues[2]),
		// 400, y += dp, paint);
		canvas.drawText("GroundBasedAccelerationValues:", 400, y += dp, paint);
		canvas.drawText(
				"x:"
						+ Float.toString(JimmyActivity.getActivity().phoneGroundBasedAccelerationValues[0]),
				400, y += dp, paint);
		canvas.drawText(
				"y:"
						+ Float.toString(JimmyActivity.getActivity().phoneGroundBasedAccelerationValues[1]),
				400, y += dp, paint);
		canvas.drawText(
				"z:"
						+ Float.toString(JimmyActivity.getActivity().phoneGroundBasedAccelerationValues[2]),
				400, y += dp, paint);
		canvas.drawText("PhoneV:", 400, y += dp, paint);
		canvas.drawText("x:" + Float.toString(JimmyActivity.getActivity().phoneV[0]), 400, y += dp,
				paint);
		canvas.drawText("y:" + Float.toString(JimmyActivity.getActivity().phoneV[1]), 400, y += dp,
				paint);
		// canvas.drawText("z:" +
		// Float.toString(JimmyActivity.getActivity().phoneV[2]), 400, y += dp,
		// paint);
		canvas.drawText("phoneP:", 400, y += dp, paint);
		canvas.drawText("x:" + Float.toString(JimmyActivity.getActivity().phoneP[0]), 400, y += dp,
				paint);
		canvas.drawText("y:" + Float.toString(JimmyActivity.getActivity().phoneP[1]), 400, y += dp,
				paint);
		// canvas.drawText("z:" +
		// Float.toString(JimmyActivity.getActivity().phoneP[2]), 400, y += dp,
		// paint);

	}

	@Override
	public boolean onBackKey() {
		removeThis();
		return true;
	}

}
