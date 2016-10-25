package net.muststudio.babyprotecter;

import net.muststudio.babyprotecter.gui.TemperatureViewer.TemperatureSource;

public class BluetoothTemperatureSource implements TemperatureSource {
	private boolean Ir;

	public BluetoothTemperatureSource() {
		this(false);
	}

	public BluetoothTemperatureSource(boolean Ir) {
		this.Ir = Ir;
	}

	@Override
	public double getTemperature() {
		if (Ir)
			return JimmyActivity.getActivity().sensorIrTemperature;
		else
			return JimmyActivity.getActivity().sensorAmbientTemperature + 3;
	}
}