import matplotlib.pyplot as plt

# Data from the spreadsheet
distances = [0.0125, 0.03]  # Distance between magnet poles (m)
avg_voltages = [0.040557, 0.021406]  # Average voltage (V)
resistances = [4.6, 4.7]  # Resistance of the coil (ohms)
energy_loss = [0.0233524621, 0.0298202462]  # Total energy loss (J)

# Constants
num_turns = 200  # Number of turns in the coil
coil_area = 0.0005309  # Area of the coil (m^2)

# Create the first plot (Average Voltage vs. Distance)
plt.figure(figsize=(8, 5))
plt.plot(distances, avg_voltages, marker='o')
plt.xlabel('Distance between Magnet Poles (m)')
plt.ylabel('Average Voltage (V)')
plt.title('Average Voltage vs. Distance between Magnet Poles')
plt.grid(True)
plt.tight_layout()
plt.show()

# Create the second plot (Total Energy Loss vs. Resistance)
plt.figure(figsize=(8, 5))
plt.plot(resistances, energy_loss, marker='o')
plt.xlabel('Resistance of the Coil (ohms)')
plt.ylabel('Total Energy Loss (J)')
plt.title('Total Energy Loss vs. Resistance of the Coil')
plt.grid(True)
plt.tight_layout()
plt.show()

# Print the constants
print("Constants:")
print(f"Number of turns in the coil: {num_turns}")
print(f"Area of the coil: {coil_area} m^2")