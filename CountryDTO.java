package com.xworkz.DTO;

public class CountryDTO {
	private String name;
	private String continent;
	private String[] states;
	private long population;
	private String primeMinister;
	private String president;
	private String[] languages;

	public CountryDTO() {
		System.out.println(" default constructors");
	}

	public CountryDTO(String name, String continent) {

		System.out.println("creaeted 1st DTO");
		this.name = name;
		this.continent = continent;
	}

	public CountryDTO(long population, String primeMinister, String president) {
		System.out.println("creaeted 2nd DTO");
		this.population = population;
		this.primeMinister = primeMinister;
		this.president = president;
	}

	public CountryDTO(String[] states, String[] languages) {
		this.states = states;
        this.languages = languages;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String[] getStates() {
		return states;
	}

	public void setStates(String[] states) {
		this.states = states;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

}