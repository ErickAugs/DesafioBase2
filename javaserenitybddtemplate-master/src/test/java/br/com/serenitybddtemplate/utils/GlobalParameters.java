package br.com.serenitybddtemplate.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class GlobalParameters {
    public static String timeStamp = new SimpleDateFormat("yyyyMMdd_HH_mm_ss_SSS").format(new Date(System.currentTimeMillis()));
    public static String SENHA_MANTIS;
    public static String USUARIO_MANTIS;
    public static String pathReport = "${user.dir}\\Reports\\Relatorios_AutomacaoTesteAutbank\\SerenityReport\\Report_" + timeStamp;
    public static final String REPORT_PATH_DOCS = System.getProperty("user.dir") + "\\" + "DocsGerados";
    private static Properties properties;

    public GlobalParameters() {
        properties = new Properties();
        try {
            InputStream input = new FileInputStream("serenity.properties");
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        USUARIO_MANTIS = properties.getProperty("login.mantis");
        SENHA_MANTIS = properties.getProperty("senha.mantis");

    }
}

