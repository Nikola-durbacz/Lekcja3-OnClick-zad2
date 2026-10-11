Wspólny View.OnClickListener  zdefiniowany w polu counterListener w klasie MainActivity. Rozpoznaje kliknięty przycisk za pomocą v.getId() i wykonuje odpowiednią operację.

Podpięcie listenera przez setOnClickListener() w metodzie onCreate() ten sam obiekt counterListener jest przypisany do przycisków buttonPlus, buttonMinus i buttonReset.

Przykładowe miejsca w kodzie:

Definicja listenera: private final View.OnClickListener counterListener = v -> { ... };

Podpięcie listenera: findViewById(R.id.buttonPlus).setOnClickListener(counterListener);

Analogicznie listener jest przypisany do buttonMinus i buttonReset.

<img width="683" height="771" alt="image" src="https://github.com/user-attachments/assets/16457256-6b5d-462d-9a11-bc0f435b10d5" />
