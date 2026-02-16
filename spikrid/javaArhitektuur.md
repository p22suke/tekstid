# PROGRAMMI KIHILINE ARHITEKTUUR
Eristatud vastutused; sõltuvused liiguvad allapoole.

User Interface → Application → Domain → Infrastructure → Database

### KIHID

1. UI (Presentation)
2. Application (Orchestration / Services)
3. Domain (Business Logic)
4. Infrastructure (Persistence / External World)
5. Database (füüsiline andmete hoidla)

---

## 1. Presentation layer (UI)
- CLI, GUI, REST Controller, veebileht, I/O  
- Vastutab kasutajaga suhtlemise eest: kogub sisendi, kuvab tulemuse  
- Ei tee äriloogikat ega salvestust  
- Sõltub **Application layerist**

---

## 2. Application layer
- Use cases / Services  
- Orkestreerib domain-objektide tööd ja protsesse  
- Loob domain-objekte, kutsub domain kalkulatsioone, salvestab vajadusel tulemuse  
- Sõltub **Domain layerist**  
- Ei sisalda ärireegleid ega valemeid

---

## 3. Domain layer
- Entities, Value Objects, Business Rules, Logic  
- Sisaldab ärireegleid, valemeid, valideerimist, domeeni mõisteid  
- Ei sõltu UI-st, Applicationist ega Infrastructure’ist  

---

## 4. Infrastructure layer
- Persistence, failid, DB, võrguteenused, API  
- Rakendab Domaini liideseid (nt Repository interface) ja salvestab andmeid  
- Sõltub **Domain layerist**, mitte vastupidi  

---

## 5. Database
- Füüsiline andmete hoidla (SQL, NoSQL, failid)  
- Infrastructure’i osa  