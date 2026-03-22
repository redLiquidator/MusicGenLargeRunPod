# ===== setup (처음 1회 실행용, 나중엔 주석 가능) =====
import os

# ===== model =====
from audiocraft.models import MusicGen
import torchaudio

model = MusicGen.get_pretrained("facebook/musicgen-large")
model.set_generation_params(duration=20)

# ===== generate =====
descriptions = [
    "bossa nova with strong melodic theme, acoustic guitar lead, emotional, warm, cafe atmosphere, clear melody"
]

wav = model.generate(descriptions)

# ===== save ===== 
output_path = "/workspace/output.wav"
torchaudio.save(output_path, wav[0].cpu(), 32000)

print("Saved:", output_path)

# ===== run ====== !python /workspace/run_musicgen.py
