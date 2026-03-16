# PROGRAMMI KIHID 
## Layered Architecture
Vastutused olgu eristatud & sõltuvused toetuvad teineteisele.

User Interface → Application → Domain → Infrastructure → Database

### KIHID

1. UI (Presentation)
2. Application (Orchestration / Services)
3. Domain (Business Logic)
4. Infrastructure (Persistence / External World)
5. Database (füüsiline andmete hoidla)

---

## 1. Presentation layer (UI)
**KIRJUTAME VIIMASENA, SEST S6LTUB K6IGIST TEISTEST**
- CLI, GUI, REST Controller, veebileht, I/O  
- Vastutab kasutajaga suhtlemise eest: kogub sisendi, kuvab tulemuse  
- EI tee äriloogikat ega salvestust  
- Sõltub **Application layerist**

---

## 2. Application layer
**KIRJUTAME TEISENA, SEST VAJAB ALUMISI, ET VAHENDADA K6IKE SEALT ESIMESELE**
- Use cases / Services  
- Orkestreerib domain-objektide tööd ja protsesse  
- Loob domain-objekte, kutsub domain kalkulatsioone, salvestab tulemuse Infrastructure kaudu  
- Sõltub **Domain layerist**  
- EI sisalda ärireegleid ega valemeid

---

## 3. Domain layer
**KIRJUTAME ESIMESENA. PROGRAMMI SYDA**
- Entities, Value Objects, Business Rules, Logic  
- Sisaldab ärireegleid, valemeid, valideerimist, domeeni mõisteid  
- EI sõltu UI-st, Applicationist ega Infrastructure’ist  
- EI tee salvestamist ega I/O-d

---

## 4. Infrastructure layer
**KIRJUTAME KOLMANDANA, VAHENDAB VARASALVE**
- Persistence, failid, DB, võrguteenused, API  
- Rakendab Domaini liideseid (nt Repository interface) ja salvestab andmeid  
- Sõltub **Domain layerist**, mitte vastupidi  
- Database’iga suhtleb ainult Infrastructure

---

## 5. Database
- Füüsiline andmete hoidla (SQL, NoSQL, failid)  
- Infrastructure’i osa

---
# KIHILISE ARHITEKTUURI KAUSTASTRUKTUURID
Need kaustade ja kihtide standardid on laialdaselt kasutatud tarkvaraarenduses, sest need aitavad hoida koodi loogiliselt organiseerituna, eristada vastutusi ja teha projekti hooldamise ning laiendamise lihtsamaks. java on tihti allikkeel, mist6ttu algavad javaprogrammid src kausta loomisega. 

## CLI PROJEKT
    ProjectName/
    │
    ├─ src/
    │   └─ main/
    │       └─ java/
    │           ├─ Main.java    <- Presentation / UI
    │           ├─ Application.java  <- Application layer / Services
    │           └─ Domain.java    <- Domain layer / Business Logic
    │
    └─ .gitignore

* **Main.java** – küsib sisendi, kuvab tulemuse
* **Application.java** – orkestreerib Domain objekte, kutsub arvutusi
* **Domain.java** – sisaldab äriloogikat, valemeid, reegleid

## DESKTOP GUI PROJECT (Swing / JavaFX)

    ProjectName/
    │
    ├─ src/
    │   └─ main/
    │       └─ java/
    │           ├─ domain/
    │           │    └─ Domain.java
    │           │
    │           ├─ application/
    │           │    └─ Application.java
    │           │
    │           ├─ ui/
    │           │    ├─ Main.java
    │           │    └─ CalculatorGUI.java  <- aknad, nupud, tekstiväljad
    │           │
    │           └─ infrastructure/  <- valikuline
    │                └─ FileRepository.java
    │
    ├─ resources/
    │    ├─ styles.css  <- GUI stiilid, värvid, fontid
    │    └─ images/  <- pildid, ikoonid
    │
    └─ .gitignore

* **domain/** – äriloogika
* **application/** – orkestreerib domain objekte
* **ui/** – GUI komponendid ja Main.java
* **infrastructure/** – failide/andmebaasi salvestus
* **resources/** – CSS, pildid, keelefailid

## WEB PROJECT (HTML, CSS, JS + Java backend)
    ProjectName/   
    │
    ├─ src/
    │   └─ main/
    │       └─ java/
    │           ├─ domain/
    │           │    └─ Domain.java
    │           │
    │           ├─ application/
    │           │    └─ Application.java
    │           │
    │           └─ ui/
    │                └─ WebController.java  <- REST API / kontroller
    │
    ├─ web/
    │   ├─ index.html   <- HTML struktuur
    │   ├─ css/
    │   │    └─ style.css   <- värvid, fontid, layout
    │   └─ js/
    │        └─ script.js  <- input/output, interaktiivsus
    │
    └─ .gitignore

* **domain/** – äriloogika ja arvutused
* **application/** – orkestreerib domain objekte
* **ui/WebController.java** – REST endpoint, JSON input/output
* **web/** – frontend failid (HTML, CSS, JS)
