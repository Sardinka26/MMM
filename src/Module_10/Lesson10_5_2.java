package Module_10;

import java.util.Random;

public class Lesson10_5_2 {
    public static float[] generatePatientsTemperatures(int patientsCount) {
        Random random = new Random();
        float[] array = new float[patientsCount];
        float minValue = 32;
        float maxValue = 40;

        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (Math.random() * (maxValue - minValue) + minValue);
            double value = array[i];
            double scale = Math.pow(10, 1);
            double result = Math.ceil(value * scale) / scale;
            array[i] = (float) result;
        }
        return array;
    }

    public static String getReport(float[] temperatureData) {
        int countHealthyPatients = 0;
        float sumTemp = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < temperatureData.length; i++) {
            sumTemp = sumTemp + temperatureData[i];
            if (temperatureData[i] >= 36.2f && temperatureData[i] <= 36.9f) {
                countHealthyPatients++;
            }
        }

            float averageTemp = sumTemp / temperatureData.length;

            for (int s = 0; s < temperatureData.length; s++) {
                stringBuilder.append(temperatureData[s] + " ");
            }

            String tempPatients = stringBuilder.toString().strip();

            String report =
                    "Температуры пациентов: " + tempPatients +
                            "\nСредняя температура: " + Math.round(averageTemp * 100.0) / 100.0 +
                            "\nКоличество здоровых: " + countHealthyPatients;

            return report;
        }
    }



