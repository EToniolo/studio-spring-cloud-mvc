# Use Python 3.12 as base image
FROM python:3.12-slim

# Set the working directory in the container
WORKDIR /app

EXPOSE 9000

# Copy the current directory contents into the container at /app
COPY . /app

# Command to run the Python script
CMD ["/app/run.sh"]

