import matplotlib.pyplot as plt
import numpy as np

def add_labels(rects):
    for rect in rects:
        height = rect.get_height()
        ax.annotate(f'{height}%',
                    xy=(rect.get_x() + rect.get_width() / 2, height / 2),
                    xytext=(0, 0),  # no offset
                    textcoords="offset points",
                    ha='center', va='center', color='white')

# 6th Grade Returning Students
labels = ['Math', 'Reading']
cov_6th = [50, 38]
bridge_6th = [9, 19]
x = np.arange(len(labels))  # the label locations
width = 0.35  # the width of the bars

fig, ax = plt.subplots(figsize=(5, 6))
rects1 = ax.bar(x - width/2, cov_6th, width, label='Covenant', color='#3B7A44')
rects2 = ax.bar(x + width/2, bridge_6th, width, label='Bridgeport', color='#0C5685')

ax.set_xticks(x)
ax.set_xticklabels(labels)
ax.legend()

add_labels(rects1)
add_labels(rects2)

# Save 

plt.savefig('6th_grade_returning_students.png', dpi=300)

# 7th Grade Returning Students
labels = ['Math', 'Reading']
cov_7th = [67, 67]
bridge_7th = [9, 18]
x = np.arange(len(labels))

fig, ax = plt.subplots(figsize=(5, 6))
rects1 = ax.bar(x - width/2, cov_7th, width, label='Covenant', color='#3B7A44')
rects2 = ax.bar(x + width/2, bridge_7th, width, label='Bridgeport', color='#0C5685')

ax.set_xticks(x)
ax.set_xticklabels(labels)
ax.legend()

add_labels(rects1)
add_labels(rects2)

# Save

plt.savefig('7th_grade_returning_students.png', dpi=300)

# 6th Grade Returning Students - Percentiles
labels = ['Math', 'Reading']
cov_6th_perc = [75, 94]
bridge_6th_perc = [38, 19]
x = np.arange(len(labels))

fig, ax = plt.subplots(figsize=(5, 6))
rects1 = ax.bar(x - width/2, cov_6th_perc, width, label='Covenant', color='#3B7A44')
rects2 = ax.bar(x + width/2, bridge_6th_perc, width, label='Bridgeport', color='#0C5685')

ax.set_xticks(x)
ax.set_xticklabels(labels)
ax.legend()

add_labels(rects1)
add_labels(rects2)

# Save

plt.savefig('6th_grade_returning_students_percentile.png', dpi=300)

