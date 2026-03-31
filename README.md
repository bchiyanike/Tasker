## **HOW TO USE THE TEMPLATE**

### **Method 1: Quick Start (Recommended)**

```bash
# 1. Clone the template
git clone https://github.com/bchiyanike/Template.git MyNewProject

# 2. Navigate into it
cd MyNewProject

# 3. Remove old git history
rm -rf .git

# 4. Initialize new repository
git init
git add .
git commit -m "Initial commit from template"

# 5. Create new repo on GitHub (do this on github.com)
# Then connect it:
git remote add origin https://github.com/bchiyanike/MyNewProject.git
git branch -M main
git push -u origin main

# 6. Run the rename workflow on GitHub
# Go to: Actions → Rename Template → Run workflow
# Enter:
#   Old name: template
#   New name: mynewproject
#   App name: MyNewProject

# 7. Pull the changes
git pull origin main

# 8. Build and run
./gradlew clean build
```

---

### **Method 2: Use GitHub's "Use This Template" Button**

```bash
# 1. On GitHub, go to: github.com/bchiyanike/Template

# 2. Click green "Use this template" button → "Create a new repository"

# 3. Enter:
#    Repository name: MyNewProject
#    Description: (optional)
#    Public/Private

# 4. Click "Create repository"

# 5. Clone your new repo
git clone https://github.com/bchiyanike/MyNewProject.git
cd MyNewProject

# 6. Run the rename workflow (same as Method 1, step 6)

# 7. Pull and build (same as Method 1, steps 7-8)
```

---

### **Summary**

1. **Clone** template → **Remove** .git → **Init** new repo → **Push** to GitHub
2. **Run workflow** on GitHub (Actions tab) to rename package
3. **Pull** changes → **Build** project
4. Start coding! 🚀
