package converter;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Conversao {
    String result = "";
    String time_last_update_utc = "";
    String base_code = "";
    String target_code = "";
    Double conversion_rate = 0.0;
    Double conversion_result = 0.0;

    //onedDateTime agora = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));

    public String getResult() {
        return result;
    }

    public String getTime_last_update_utc() {
        ZonedDateTime agora = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formatter);
        return dataHoraFormatada;
    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public Double getConversion_rate() {
        return conversion_rate;
    }

    public Double getConversion_result() {
        return conversion_result;
    }

    @Override
    public String toString() {
        return "______________________________________________________ \n" +
                "Resultado da conversão \n" +
                "Data da convesão = " + getTime_last_update_utc() + '\n' +
                "Moeda base = " + base_code + '\n' +
                "Moeda alvo = " + target_code + '\n' +
                "Taxa de convesão = " + conversion_rate + '\n' +
                "Valor convertido = " + conversion_result;
    }
}
