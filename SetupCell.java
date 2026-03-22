# ===== SETUP CELL =====
!apt-get update
!apt-get install -y pkg-config ffmpeg libavformat-dev libavcodec-dev libavdevice-dev libavutil-dev libavfilter-dev libswscale-dev libswresample-dev

!pip install -U pip setuptools wheel
!pip install torch torchaudio --index-url https://download.pytorch.org/whl/cu121
!pip install "numpy==1.26.4" "transformers==4.44.2" accelerate
!pip install audiocraft

