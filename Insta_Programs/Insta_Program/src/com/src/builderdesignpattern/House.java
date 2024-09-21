package com.src.builderdesignpattern;

// House.java
public class House {
	private String foundation;
	private String structure;
	private String roof;
	private boolean hasPool;
	private boolean hasGarden;
	private boolean hasGarage;

	// Private constructor to ensure object creation is through the builder
	private House(HouseBuilder builder) {
		this.foundation = builder.foundation;
		this.structure = builder.structure;
		this.roof = builder.roof;
		this.hasPool = builder.hasPool;
		this.hasGarden = builder.hasGarden;
		this.hasGarage = builder.hasGarage;
	}

	// Getters for the attributes
	public String getFoundation() {
		return foundation;
	}

	public String getStructure() {
		return structure;
	}

	public String getRoof() {
		return roof;
	}

	public boolean hasPool() {
		return hasPool;
	}

	public boolean hasGarden() {
		return hasGarden;
	}

	public boolean hasGarage() {
		return hasGarage;
	}

	@Override
	public String toString() {
		return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", hasPool="
				+ hasPool + ", hasGarden=" + hasGarden + ", hasGarage=" + hasGarage + "]";
	}

	// Static nested class for the builder
	public static class HouseBuilder {
		private String foundation;
		private String structure;
		private String roof;
		private boolean hasPool;
		private boolean hasGarden;
		private boolean hasGarage;

		// Required attributes are passed through the constructor
		public HouseBuilder(String foundation, String structure, String roof) {
			this.foundation = foundation;
			this.structure = structure;
			this.roof = roof;
		}

		// Methods for optional attributes
		public HouseBuilder setPool(boolean hasPool) {
			this.hasPool = hasPool;
			return this;
		}

		public HouseBuilder setGarden(boolean hasGarden) {
			this.hasGarden = hasGarden;
			return this;
		}

		public HouseBuilder setGarage(boolean hasGarage) {
			this.hasGarage = hasGarage;
			return this;
		}

		// Build method to create the final House object
		public House build() {
			return new House(this);
		}
	}
}
