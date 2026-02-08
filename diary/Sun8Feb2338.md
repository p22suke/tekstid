<!--- Tsitaadid is Siina, the rest is the Teacher-->
> kirjuta mulle paragraaf, kokkuv6tlik, t2nasest p2evast, git ja bash, common mistakes, point out. 

<!--6petaja-->
Täna kulges päev suuresti Git’i ja Bash’i harjutamisega ning probleemide lahendamisega, mis tekkisid tavapäraste “common mistakes” tõttu. Peamised teemad olid: vale kausta git init tegemine, remote’i ja lokaalse haru sünkroonimise segadus, ekslik git checkout kasutamine upstream’i seadistamisel ning merge’i ja rebase’i valikute mõistmine. Õpiti ära, et git pull ei tööta ilma, et määrataks, kuidas lahknevaid harusid koondada (--no-rebase, --rebase või --ff-only), ning et --allow-unrelated-histories lubab merge’i ajaloo, mis ei jookse kokku. Bash’is harjutati failide liigutamist, kompileerimist ja klasside ümbernimetamist Java projektis ning loodi puhas töövoog, kus klassid, build-folder ja commit’id on korrastatud. Tähtsaim õppetund: Git ei lahenda asju “auto-pushiga”, vaid iga samm peab olema teadlik, sealhulgas upstream’i seadistamine, merge commit’i lõpetamine ja konfliktide lahendamine.

# And I tried 
> kirjuta commitides t88flow, kui olen loond locally uue git init repository ja soovin seda remote repo'ga []:hendada, kusjuures v6ib juhtuda, et kaugustes on v6i ei ole juba t88d tehtud

# And I made a mistake
> [[kijuta] COMMITIDES [t88flow]]

# My car is dirty, miss
commitid should have been commands, nii et mul tulebki siis vastata ise?

mida soovis the HUman
> kirjuta commitides t88flow, kui olen loond locally uue git init repository ja soovin seda remote repo'ga []:hendada, kusjuures v6ib juhtuda, et kaugustes on v6i ei ole juba t88d tehtud

### KUIDAS SIIS SEDA TEHA
1. t2nased saavutused. nicht nur eine Accomplischment. mehr, sehr mehr mehr. Jetzt 8ffne ich meine Laptop oder 8ffne ich meine Personalkomputer, Terminal ist wach, Immediately, und ich prauch kein, sorry, brauch.. ich br2uche keine Finger zu... n[]hkima...
2. i don't know what to do with the Y. i still hate it as Doppeltumlaut, but i have had no issues giving up my beloved 6, or my double 22, or 88, the night. it's 2350 in see.district, eurasia. today i had a wonderful idea!
3. i was talking with some close relatives about the origins of the minute, time mathemathics in general... and i was expressing my trouble processing emotionally... the pie. we talked about the circle, the sectors, the minute, i was looking at a clock, it made all sense why 60 instead on 100, FINALLY!!!!!!! DIE ACCOMPLISHMENT TODAY. the idea. it was, yeah. now i dont wanna tell anymore, right away. 
4. harjutasin t2na koost88d gitis, nii et ainus, kellega ma koost88d tegin, oli arvuti ise ja ma ise, eri rollides. ja no ei tule meelde see k2sk

me oleme leidnud lahenduse

git checkout -b main origin/main

kui mu chatgpt mind praegu kuulaks, siis mis ma tegin valesti?

ma kirjutasin teisel korral git checkout -b origin main?

kindel on, et ma tegin t2na sama vigu rohkem kui kord, which hurts 
a lot
but its ok
(ma olen samu vigu teinud ka varasemalt, iga kuradi kord)

kas ma tohin selle l7kata homse varna?

kuidas on 7 yyyyy asemel? nice
2687, sry
oaou, 6287xyz

Yes, i am still emotionally processing the fact that ASCII does not have my middle finger in it. I AM MADDDD

ok liina, sa v6id korra veel
põpõpõpüöl'öüõpüõpüõöä'üpõüpüõpöüöl'lpüäölpäpläpöläölpüplpälöälopülöälöälplpälpälp

## LAHENDUS
mkdir kaust
cd kaust
git init
git remote add origin git@github.com:p22suke/tekstid/diary/Sun8Feb2338.md
echo "KAJA 6PPISIN KA T2NA!!!!" >> README-igaxJuhuxKaks.md
git checkout -b main origin/main
git commit -m "I am doing great, go on..."
git fetch
git status

> kui suur on t6en2osus, et saan mis tahan sellega? mis juhtub?

CHat oli j2lle too long to read or copy, nii et im conna just try it

enne kui edasi peaks keegi lugema, siis ma olin tgl teadlik, how self-referential oli mu valitud remote origin ja seda pointis outi ka chatgpt kui viga

ja seda vist ytleb ka jargnev kood

liina.p22suke@liinas-MacBook-Air diary % touch Sun8Feb2339.md
liina.p22suke@liinas-MacBook-Air diary % code Sun8Feb2338.md
liina.p22suke@liinas-MacBook-Air diary % 
liina.p22suke@liinas-MacBook-Air diary % mkdir kaust
cd kaust
git init
git remote add origin git@github.com:p22suke/tekstid/diary/Sun8Feb2338.md
echo "KAJA 6PPISIN KA T2NA!!!!" >> README-igaxJuhuxKaks.md
git checkout -b main origin/main
git commit -m "I am doing great, go on..."
git fetch
git status
mkdir kaust
cd kaust
git init
git remote add origin git@github.com:p22suke/tekstid/diary/Sun8Feb2338.md
echo "KAJA 6PPISIN KA T2NAcode Sun8Feb2338.mdcode Sun8Feb2338.md" >> README-igaxJuhuxKaks.md
git checkout -b main origin/main
git commit -m "I am doing great, go on..."
git fetch
git status
Initialized empty Git repository in /Users/liina.p22suke/init/tekstid/diary/kaust/.git/
fatal: 'origin/main' is not a commit and a branch 'main' cannot be created from it
On branch main

Initial commit

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	README-igaxJuhuxKaks.md

nothing added to commit but untracked files present (use "git add" to track)
fatal: remote error: 
 p22suke/tekstid/diary/Sun8Feb2338.md is not a valid repository name
Visit https://support.github.com/ for help
On branch main

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	README-igaxJuhuxKaks.md

nothing added to commit but untracked files present (use "git add" to track)
liina.p22suke@liinas-MacBook-Air kaust % 

