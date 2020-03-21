package com.kerry.creator.dubbo.protocol.http;

import com.kerry.creator.dubbo.framework.Invocation;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
public class HttpClient {

    public String send(String hostname, Integer post, Invocation invocation) {
        ObjectOutputStream oos = null;
        try {
            URL url = new URL("http", hostname, post, "/");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);

            OutputStream outputStream = urlConnection.getOutputStream();
            oos = new ObjectOutputStream(outputStream);
            oos.writeObject(invocation);

            InputStream inputStream = urlConnection.getInputStream();
            String result = IOUtils.toString(inputStream);

            return result;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.flush();
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
