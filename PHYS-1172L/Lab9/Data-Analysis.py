import matplotlib.pyplot as plt

# Extracted data from the CSV (spreadsheet)

case1_white = {'mass': [250, 250, 250, 250, 250, 250], 
               'wavelength': [2.376, 1.173, 0.784, 0.588, 0.463, 0.384],
               'frequency': [24.0, 48.2, 71.9, 96.0, 120.0, 143.9],
               'velocity_fn': [56.30849324, 56.30849324, 56.30849324, 56.30849324, 56.30849324, 56.30849324],
               'velocity_wl': [57.0240, 56.5386, 56.3696, 56.4480, 55.5600, 55.2576]}

case2_white = {'mass': [350, 350, 350, 350, 350, 350],
               'wavelength': [2.358, 1.179, 0.795, 0.58, 0.47, 0.392], 
               'frequency': [28.2, 57.0, 85.5, 114.1, 142.7, 173.2],
               'velocity_fn': [66.6251077, 66.6251077, 66.6251077, 66.6251077, 66.6251077, 66.6251077], 
               'velocity_wl': [66.4956, 67.2030, 67.9725, 66.1780, 67.0690, 67.8944]}

case1_yellow = {'mass': [250, 250, 250, 250, 250, 250],
                'wavelength': [2.398, 1.199, 0.798, 0.6, 0.482, 0.394],
                'frequency': [17.4, 34.2, 52.3, 69.8, 87.0, 105.0], 
                'velocity_fn': [42.8112421, 42.8112421, 42.8112421, 42.8112421, 42.8112421, 42.8112421],
                'velocity_wl': [41.7252, 41.0058, 41.7354, 41.8800, 41.9340, 41.3700]}
                
case2_yellow = {'mass': [350, 350, 350, 350, 350, 350],
                'wavelength': [2.398, 1.199, 0.803, 0.598, 0.477, 0.397],
                'frequency': [20.5, 41.0, 61.7, 82.3, 103.0, 124.1],
                'velocity_fn': [50.65494478, 50.65494478, 50.65494478, 50.65494478, 50.65494478, 50.65494478], 
                'velocity_wl': [49.1590, 49.1590, 49.5451, 49.2154, 49.1310, 49.2677]}

# Graph 1: Wavelength vs Frequency for all cases
plt.figure(figsize=(8,6))
plt.plot(case1_white['frequency'], case1_white['wavelength'], 'o-', label='Case 1 (White)')  
plt.plot(case2_white['frequency'], case2_white['wavelength'], 'o-', label='Case 2 (White)')
plt.plot(case1_yellow['frequency'], case1_yellow['wavelength'], 'o-', label='Case 1 (Yellow)')
plt.plot(case2_yellow['frequency'], case2_yellow['wavelength'], 'o-', label='Case 2 (Yellow)')
plt.xlabel('Frequency (Hz)')
plt.ylabel('Wavelength (m)')
plt.title('Wavelength vs Frequency')
plt.legend()
plt.grid()
plt.show() # Show using native GUI

# Graph 2: Velocity (fn) vs Velocity (wl) for all cases 
plt.figure(figsize=(8,6))
plt.plot(case1_white['velocity_fn'], case1_white['velocity_wl'], 'o', label='Case 1 (White)')
plt.plot(case2_white['velocity_fn'], case2_white['velocity_wl'], 'o', label='Case 2 (White)') 
plt.plot(case1_yellow['velocity_fn'], case1_yellow['velocity_wl'], 'o', label='Case 1 (Yellow)')
plt.plot(case2_yellow['velocity_fn'], case2_yellow['velocity_wl'], 'o', label='Case 2 (Yellow)')
plt.xlabel('Velocity from f and λ (m/s)')
plt.ylabel('Velocity from T and μ (m/s)') 
plt.title('Velocity Comparison')
plt.legend()
plt.grid()
plt.show() # Show using native GUI 