package com.example.computers.Data;

import com.example.computers.Object.News;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class DataNews {
    private ArrayList<News> news;

    public DataNews() {
        this.news = new ArrayList<>();
        filling();
    }

    private void filling() {
        int id = 0;

        News object = new News(id, "Уголовное дело", "Против москвича, сдававшего жильё только лицам азиатской внешности, " +
                "возбудили уголовное дело.", "img/panorama_msk.jpg");
        object.setFulltext("«Уроженец города Ош, Киргизской ССР, вступивший в гражданство Российской Федерации в 2015 году, " +
                "размещал на ресурсах телекоммуникационной сети «Интернет» объявления с предложением аренды жилья исключительно " +
                "людям с характерной азиатской внешностью. При попытке иных лиц арендовать жилое помещение владелец им " +
                "категорически отказывал, ссылаясь на текст объявления», – объяснили в пресс-службе ведомства. По данным СК, " +
                "за прошедшие шесть месяцев отказ получили 28 армян, 17 азербайджанцев, 32 представителя других народов Кавказа " +
                "и более 50 россиян славянской внешности, идентифицирующих себя как русские. Один из них, член партии «Другая Россия», " +
                "после общения с Ниязом З. обратился в правоохранительные органы с целью реализовать свои конституционные права. " +
                "Следователи усмотрели в поведении уроженца Киргизии действия, направленные на унижение человеческого достоинства. " +
                "Дело передано в суд. Обвиняемому грозит штраф в размере от 300 тысяч до 600 тысяч рублей или в размере заработной " +
                "платы или иного дохода осужденного за период от двух до трех лет.");
        object.setFullHeader("Следственный Комитет сообщил о возбуждении уголовного дела против 38-летнего москвича Нияза З. " +
                "за разжигание ненависти и национальной розни. В СК отмечают, что мужчина нарушал нормы Конституции, " +
                "сдавая в аренду жилплощадь исключительно людям, предположительно принадлежащим к определённым гаплогруппам. ");
        news.add(object);
        id++;

        object = new News(id, "Мировая политика", "Сан-Марино передаст Украине ядерное оружие",
                "img/san_marino.jpg");
        object.setFulltext("Согласно летописям, данные пушки, которые были установлены возле здания городской синьории, " +
                "были подарены герцогом Людовиком II Бурбоном по случаю победы в битве при Рокруа. " +
                "Сохранившаяся в архивах Сан-Марино накладная сообщает, что пушки поступили «в негодном состоянии, " +
                "совсем ржавые и для боя непригодные», однако местным умельцам удалось отчистить из от ржавчины и копоти и " +
                "использовать для обороны правительственного здания. Во время вторжения Наполеона Сан-Марино угрожало " +
                "применить пушки против армии французского императора, если он откажется принять капитуляцию республики. " +
                "Получив пушки и ядра к ним, Украина примет на себя обязательство вернуть все музейные экспонаты в целости и сохранности. " +
                "«Конечно, каждое ядро у нас числится в музее, и утеря даже одного экспоната была бы трагедией, - " +
                "рассказывает директор Музея истории Сан-Марино Карло Буанконте. – Однако мы не могли просто проигнорировать просьбу " +
                "Украины о ядерном оружии. Наше государство – одно из немногих в Европе, где оно всё ещё стоит на вооружении, " +
                "и поэтому мы сразу откликнулись. Однако мы чётко заявили президенту Зеленскому, что использовать его в бою он не " +
                "должен, но может использовать его для устрашения российской армии и ядерного шантажа»");
        object.setFullHeader("Светлейшая республика Сан-Марино стала единственной из стран Европы, которая откликнулась на просьбу Владимира " +
                "Зеленского предоставить Украине ядерное оружие. ВСУ получит от синьории Сан-Марино 4 пушки XVI века и " +
                "35 чугунных ядер для стрельбы из них.");
        news.add(object);
        id++;
        object = new News(id, "Внутренняя политика", "Москвич продал место в очереди в Верхнем Ларсе за 20 млн рублей",
                "img/lars.jpg");
        object.setFulltext("Объявление о продаже места в очереди за 1 миллион рублей было опубликовано на сайте Avito.ru 1 октября," +
                " когда ожидаемое время прохождения таможенного контроля оценивалось в 5 дней. В течение первого часа на него откликнулось" +
                " более тысячи потенциальных покупателей, из-за чего Степану пришлось несколько раз повышать цену, " +
                "пока не остался один человек, готовый приобрести билет за цену в 20 раз выше исходной. Сделка прошла на месте, " +
                "после чего Яблочков уехал в Москву. По данным журналистов, человек, купивший место в очереди, так и не смог " +
                "попасть на территорию Грузии, вернувшись обратно с повесткой из военкомата. «Я довольно опытен в таких сделках," +
                " – рассказал Степан Яблочков. – Ещё с 2015 года я заранее занимал очередь за новой моделью айфона и продавал" +
                " его кому-нибудь. Деньги были неплохие, к 18 годам у меня уже была квартира в Москве и две машины. Конечно," +
                " в однокомнатной мне сейчас тесновато, да и цены на недвижимость рухнули, так что я решил, " +
                "что могу немного докинуть денег и купить трёшку на Арбате. Я даже и не думал, что место в очереди уйдёт за 20 миллионов." +
                " Теперь я не только буду жить в центре столицы, но и навсегда решу все вопросы с военкоматом».");
        object.setFullHeader("24-летний айтишник из Москвы Степан Яблочков продал своё место в очереди на КПП «Верхний Ларс» " +
                "политбеженцу из Санкт-Петербурга за 20 млн рублей. За эти деньги он намерен уладить вопросы, " +
                "связанные с мобилизацией, и приобрести новое жильё.");
        news.add(object);
        id++;
    }
}