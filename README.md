# Proje: Testinium Terfi Teslim (Gauge Test Suite)

## Proje Özeti (Summary of Project)
Bu proje, Testinium'un Gauge tabanlı test otomasyonu framework'ü üzerine inşa edilmiştir. Mobil ve web uygulamaları için çeşitli senaryoların otomatikleştirilmesini sağlar.

Proje temel özellikleri şunlardır:
- **Gauge Framework** kullanılarak oluşturulmuş test senaryoları
- **ReportPortal** entegrasyonu sayesinde test raporlarının merkezi bir sistemde tutulması
- Modüler ve genişletilebilir bir mimari
- JSON tabanlı element tanımlamaları

---

## Kullanım Kılavuzu (How to Run)
Projeyi çalıştırmak için aşağıdaki adımları takip ediniz:

1. **Çevre Gereksinimlerini Karşılayın**
    - Java 11 veya üstü
    - Maven 3.8 veya üstü
    - ChromeDriver veya FirefoxDriver uygun versiyonu

2. **Komut Çalıştırma**
   ```bash
   # Tüm testleri çalıştırmak için
   mvn clean test

   # Belirli bir tag'e sahip testleri çalıştırmak için
   mvn gauge:execute -DspecsDir=specs -Dtags="<tag_name>"

   # ReportPortal entegrasyonu ile çalıştırmak için
   mvn clean test -Dreportportal.enabled=true
   ```

---

## Kurulum Adımları (How to Setup)
Projeyi yerel makinenizde çalıştırmak için şu adımları izleyin:

1. **Depoyu Klonlayın**
   ```bash
   git clone <repository_url>
   cd TestiniumTerfiTeslim
   ```

2. **Gerekli Bağımlılıkları Yükleyin**
   ```bash
   mvn clean install
   ```

3. **Konfigürasyonları Ayarlayın**
   `src/test/resources/config.properties` dosyasını açarak gerekli bilgileri doldurun:
   ```properties
   BASE_URL=<application_base_url>
   USERNAME=<username>
   PASSWORD=<password>
   CHROME_DRIVER_PATH=<path_to_chromedriver>
   ```

4. **Driver Kurulumu**
    - ChromeDriver veya FirefoxDriver, sistem PATH'ine eklenmelidir.

---

## Raporlama (How to Generate Report)
Raporlama için **ReportPortal** entegrasyonu kullanılmaktadır.

### Adımlar:
1. `src/test/resources/config.properties` dosyasına gerekli ReportPortal bilgilerini ekleyin:
   ```properties
   reportportal.enabled=true
   reportportal.endpoint=http://<your_reportportal_endpoint>
   reportportal.project=<your_project_name>
   reportportal.token=<your_token>
   ```
2. Maven komutunu çalıştırın:
   ```bash
   mvn clean test -Dreportportal.enabled=true
   ```
3. Sonuçları görmek için ReportPortal UI'ına gidin.

---

## Kaynak Kontrolü ve Commit Yönetimi (Source Code Version Control)

### Branch Yönetimi
- Her kullanıcı, kendi geliştirme sayfası için bir branch oluşturur.
- Branch adlandırma standardı: `feature/<feature_name>` veya `bugfix/<issue_id>`

### Commit Mesajları
- **Standart Commit Formatı:**
  ```
  [TYPE] <short_description>

  [TYPE]:
  - feat: Yeni bir özellik
  - fix: Bir hatanın düzeltilmesi
  - docs: Dokümantasyon güncellemeleri
  ```

### Merge Kuralları
- Tüm merge talepleri en az bir code review onayı gerektirir.
- Doğrudan `master` branch'ine push yapmak yasaktır.

---

## Tag Yönetimi (@tag Management)
Tag'ler kullanılarak testler belirli kategorilere ayrılabilir. Örneğin:
- `@smoke` : Duman testleri
- `@regression` : Regresyon testleri
- `@critical` : Kritik testler

Komut ile çalıştırma örneği:
```bash
mvn gauge:execute -Dtags="@smoke"
```

---

## Maven Komutları (Maven Run Commands)

- Tüm testleri çalıştırmak:
  ```bash
  mvn clean test
  ```

- Belirli bir `spec` dosyasını çalıştırmak:
  ```bash
  mvn gauge:execute -DspecsDir=specs/account
  ```

- Belirli tag'e sahip testleri çalıştırmak:
  ```bash
  mvn gauge:execute -Dtags="@regression"
  ```

---

## Dizin Yapısı (Directory Structure)

```plaintext
TestiniumTerfiTeslim
├── .gauge             # Gauge Framework konfigürasyon dosyaları
├── specs              # Test senaryoları (.spec dosyaları)
│   ├── account
│   ├── add_money
│   ├── edit_account
│   └── transfer_money
├── src
│   └── test
│       ├── java
│       │   ├── com.banking.model      # Model sınıfları
│       │   ├── com.banking.pages      # Sayfa nesneleri (Page Objects)
│       │   ├── com.banking.stepImp    # Gauge step implementasyonları
│       │   └── com.banking.utils      # Yardımcı sınıflar
│       └── resources
│           ├── elementValues          # JSON formatında element tanımları
│           └── config.properties      # Test yapılandırmaları
├── pom.xml            # Maven yapılandırma dosyası
└── README.md          # Proje dokümantasyonu
```

---

## İletişim (Contact)
Herhangi bir soru için şu kişilerle iletişime geçebilirsiniz:
- [Proje Sahibi](mailto:eyupcanbilgin01@gmail.com)
