Runpod Mypod : https://console.runpod.io/pods?id=l9lqa2m7v0ctwa

<Mar 21>
Jupyter Lab 클릭 (Port 8888) -> Jupyter 들어가면: 새 Notebook 생성, MusicGen 설치, 바로 음악 생성

1.
  !pip install audiocraft

2.  
from audiocraft.models import MusicGen

model = MusicGen.get_pretrained("facebook/musicgen-large")
model.set_generation_params(duration=15)

3.
descriptions = [
    "warm bossa nova, acoustic guitar, soft jazz chords, groovy rhythm, emotional melody, cafe atmosphere"
]

wav = model.generate(descriptions)

import torchaudio
torchaudio.save("output.wav", wav[0].cpu(), 32000)

**********************************************************************
1. 한 번에 3개 뽑기
descriptions = [
    "bossa nova track with a dominant melodic theme, acoustic guitar lead carrying a clear and catchy melody, emotional progression, jazz harmony supporting the melody, soft groove, musical storytelling, non-repetitive structure"
]

model.set_generation_params(duration=20, temperature=1.1)

wav = model.generate(descriptions * 3)

👉 핵심:

* 3 → 3개 생성
temperature 1.1 → 멜로디 다양성 증가
