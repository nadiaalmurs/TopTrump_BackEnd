package com.example.toptrumps.toptrumps.components;

import com.example.toptrumps.toptrumps.models.Card;
import com.example.toptrumps.toptrumps.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CardRepository cardRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Card brimstone = new Card("Brimstone", 7, 11, 10, 6, 3, "https://media.valorant-api.com/agents/9f0d8ba9-4140-b941-57d3-a7ad57c6b417/displayicon.png");
        cardRepository.save(brimstone);

        Card viper = new Card("Viper", 7, 15, 13, 7, 9, "https://media.valorant-api.com/agents/707eab51-4836-f488-046a-cda6bf494859/displayicon.png");
        cardRepository.save(viper);

        Card omen = new Card("Omen", 10, 9, 9, 5, 8, "https://media.valorant-api.com/agents/8e253930-4c05-31dd-1b6c-968525494517/displayicon.png");
        cardRepository.save(omen);

        Card killjoy = new Card("Killjoy", 4, 13, 15, 6, 7, "https://media.valorant-api.com/agents/1e58de9c-4950-5125-93e9-a0aee9f98746/displayicon.png");
        cardRepository.save(killjoy);

        Card cypher = new Card("Cypher", 1, 9, 10, 1, 15, "https://media.valorant-api.com/agents/117ed9e3-49f3-6512-3ccf-0cada7e3823b/displayicon.png");
        cardRepository.save(cypher);

        Card sova = new Card("Sova", 6, 6, 5, 8, 5, "https://media.valorant-api.com/agents/ded3520f-4264-bfed-162d-b080e2abccf9/displayicon.png");
        cardRepository.save(sova);

        Card sage = new Card("Sage", 5, 8, 8, 3, 14, "https://media.valorant-api.com/agents/569fdd95-4d10-43ab-ca70-79becc718b46/displayicon.png");
        cardRepository.save(sage);

        Card pheonix = new Card("Pheonix", 11, 4, 5, 9, 7, "https://media.valorant-api.com/agents/eb93336a-449b-9c1b-0a54-a891f7921d69/displayicon.png");
        cardRepository.save(pheonix);

        Card jett = new Card("Jett", 15, 6, 6, 14, 6, "https://media.valorant-api.com/agents/add6443a-41bd-e414-f6ad-e58d267f4e95/displayicon.png");
        cardRepository.save(jett);

        Card reyna = new Card("Reyna", 12, 1, 1, 15, 1, "https://media.valorant-api.com/agents/a3bfb853-43b2-7238-a4f1-ad90e9e46bcc/displayicon.png");
        cardRepository.save(reyna);

        Card raze = new Card("Raze", 13, 7, 8, 11, 2, "https://media.valorant-api.com/agents/f94c3b30-42be-e959-889c-5aa313dba261/displayicon.png");
        cardRepository.save(raze);

        Card breach = new Card("Breach", 8, 9, 9, 6, 4, "https://media.valorant-api.com/agents/5f8d3a7f-467b-97f3-062c-13acf203c006/displayicon.png");
        cardRepository.save(breach);

        Card skye = new Card("Skye", 8, 8, 7, 6, 6, "https://media.valorant-api.com/agents/6f2a04ca-43e0-be17-7f36-b3908627744d/displayicon.png");
        cardRepository.save(skye);

        Card yoru = new Card("Yoru", 11, 4, 3, 10, 7, "https://media.valorant-api.com/agents/7f94d92c-4234-0a36-9646-3a87eb8b5c89/displayicon.png");
        cardRepository.save(yoru);

        Card astra = new Card("Astra", 3, 11, 9, 4, 9, "https://media.valorant-api.com/agents/41fb69c1-4189-7b37-f117-bcaf1e96f1bf/displayicon.png");
        cardRepository.save(astra);

        Card kayo = new Card("Kayo", 9, 6, 5, 10, 5, "https://media.valorant-api.com/agents/601dbbe7-43ce-be57-2a40-4abd24953621/displayicon.png");
        cardRepository.save(kayo);

        Card chamber = new Card("Chamber", 3, 7, 8, 8, 10, "https://media.valorant-api.com/agents/22697a3d-45bf-8dd7-4fec-84a9e28c69d7/displayicon.png");
        cardRepository.save(chamber);

        Card neon = new Card("Neon", 7, 2, 2, 5, 8, "https://media.valorant-api.com/agents/bb2a4828-46eb-8cd1-e765-15848195d751/displayicon.png");
        cardRepository.save(neon);

        Card fade = new Card("Fade", 8, 7, 7, 6, 4, "https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/displayiconsmall.png");
        cardRepository.save(fade);
    }
}

